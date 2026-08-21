package model;

import org.apache.poi.xwpf.usermodel.XWPFStyle;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;

import java.math.BigInteger;

public class WordStyle {
    private final CTStyle style;
    private CTHpsMeasure textSize;
    private CTFonts fontFamily;
    private CTColor fontColor;
    private CTOnOff bold;
    private CTOnOff italic;
    private CTUnderline underlinePattern;
    private CTOnOff strike;

    public WordStyle(XWPFStyle style) {
        this.style = style.getCTStyle();
    }

    private CTHpsMeasure getOrCreateSize(CTRPr runProperties) {
        if (runProperties.getSzList().isEmpty()) {
            return runProperties.addNewSz();
        }
        return runProperties.getSzList().get(0);
    }

    public void modifyStyle(ParagraphStyle paragraphStyle, TextStyle textStyle) {
        CTRPr runProperties = style.isSetRPr() ? style.getRPr() : style.addNewRPr();
        textSize = getOrCreateSize(runProperties);
        textSize.setVal(BigInteger.valueOf(textStyle.getFontSize()));
    }
}
