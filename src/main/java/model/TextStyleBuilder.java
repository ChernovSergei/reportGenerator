package model;

import org.apache.poi.xwpf.usermodel.UnderlinePatterns;

public class TextStyleBuilder {
    private String styleName;
    private int fontSize;
    private String fontFamily;
    private String fontColor;
    private boolean bold;
    private boolean italic;
    private UnderlinePatterns underlinePatterns;
    private boolean strikeTrough;

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public void setItalic(boolean italic) {
        this.italic = italic;
    }

    public void setUnderlinePatterns(UnderlinePatterns underlinePatterns) {
        this.underlinePatterns = underlinePatterns;
    }

    public void setStrikeTrough(boolean strikeTrough) {
        this.strikeTrough = strikeTrough;
    }

    public TextStyle getResult() {
        return new TextStyle(styleName,
        fontSize,
        fontFamily,
        fontColor,
        bold,
        italic,
        underlinePatterns,
        strikeTrough);
    }
}
