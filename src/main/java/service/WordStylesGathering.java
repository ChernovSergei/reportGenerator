package service;

import java.math.BigInteger;
import java.util.Map;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFStyle;
import org.apache.poi.xwpf.usermodel.XWPFStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STUnderline;
import model.WordStyle;
import model.LineType;
import repository.WordStyles;

public class WordStylesGathering {
    private final XWPFDocument document;
    private final WordStyles wordStyles;
    private final Map<String, WordStyle> definedStyles;

    public WordStylesGathering(final XWPFDocument document, final WordStyles wordStylesManager) {
        this.document = document;
        this.wordStyles = wordStylesManager;
        wordStyles.generateTextStyles();
        definedStyles = wordStyles.getTextStyles();
    }

    public void applyStylesIntoDocument() {

        final XWPFStyles documentStyles = document.getStyles() != null ? document.getStyles() : document.createStyles();

        definedStyles.keySet().forEach(styleName -> {
            XWPFStyle documentStyle = documentStyles.getStyle(styleName);

            CTStyle ctStyle = getStyle(documentStyle, styleName);
            CTRPr rPr = ctStyle.isSetRPr() ? ctStyle.getRPr() : ctStyle.addNewRPr();
            String textFont = definedStyles.get(styleName).getFontFamily();
            Integer textSize = definedStyles.get(styleName).getTextSize();
            String textColor = definedStyles.get(styleName).getFontColor();
            Boolean textBold = definedStyles.get(styleName).getBold();
            Boolean textItalic = definedStyles.get(styleName).getItalic();
            LineType lineType = definedStyles.get(styleName).getLineType();
            Boolean textStrike = definedStyles.get(styleName).getStrike();

            applyTextFonts(textFont, rPr);
            applyTextSize(textSize, rPr);
            applyTextColor(textColor, rPr);
            applyTextBold(textBold, rPr);
            applyTextItalic(textItalic, rPr);
            applyTextStrike(textStrike, rPr);
            applyTextUnderline(lineType, rPr);

            if (documentStyle == null) {
                XWPFStyles docStyles = document.createStyles();
                XWPFStyle newStyle = new XWPFStyle(ctStyle);
                docStyles.addStyle(newStyle);
            }
        });

    }

    private CTStyle getStyle(XWPFStyle documentStyle, String styleName) {
        CTStyle ctStyle = null;
        if (documentStyle != null) {
            ctStyle = documentStyle.getCTStyle();
        } else {
            ctStyle = CTStyle.Factory.newInstance();
            ctStyle.setStyleId(styleName);
            ctStyle.setType(STStyleType.PARAGRAPH);
            ctStyle.addNewName().setVal(styleName);
        }
        return ctStyle;
    }

    private void applyTextSize(Integer textSize, CTRPr rPr) {
        CTHpsMeasure size = rPr.sizeOfSzArray() > 0 ? rPr.getSzArray(0) : rPr.addNewSz();
        size.setVal(BigInteger.valueOf(textSize * 2L));
    }

    private void applyTextFonts(String font, CTRPr rPr) {
        CTFonts fonts = rPr.sizeOfRFontsArray() > 0 ? rPr.getRFontsArray(0) : rPr.addNewRFonts();
        fonts.setAscii(font);
        fonts.setHAnsi(font);
        fonts.setEastAsia(font);
        fonts.setCs(font);
    }

    private void applyTextColor(String textColor, CTRPr rPr) {
        CTColor color = rPr.sizeOfColorArray() > 0 ? rPr.getColorArray(0) : rPr.addNewColor();
        color.setVal(textColor);
    }

    private void applyTextBold(Boolean boldText, CTRPr rPr) {
        CTOnOff bold = rPr.sizeOfBArray() > 0 ? rPr.getBArray(0) : rPr.addNewB();
        bold.setVal(boldText);

    }

    private void applyTextItalic(Boolean italicText, CTRPr rPr) {
        CTOnOff italic = rPr.sizeOfIArray() > 0 ? rPr.getIArray(0) : rPr.addNewI();
        italic.setVal(italicText);
    }

    private void applyTextStrike(Boolean strikeText, CTRPr rPr) {
        CTOnOff strike = rPr.sizeOfStrikeArray() > 0 ? rPr.getStrikeArray(0) : rPr.addNewStrike();
        strike.setVal(strikeText);
    }

    private void applyTextUnderline(LineType lineType, CTRPr rPr) {
        CTUnderline underline = rPr.sizeOfUArray() > 0 ? rPr.getUArray(0) : rPr.addNewU();
        switch (lineType) {
            case SINGLE:
                underline.setVal(STUnderline.SINGLE);
                break;
            case DOUBLE:
                underline.setVal(STUnderline.DOUBLE);
                break;
            case THICK:
                underline.setVal(STUnderline.THICK);
                break;
            case DOTTED:
                underline.setVal(STUnderline.DOTTED);
                break;
            case DASH:
                underline.setVal(STUnderline.DASH);
                break;
            case WAVE:
                underline.setVal(STUnderline.WAVE);
                break;
            default:
                underline.setVal(STUnderline.NONE);
                break;
        }
    }
}
