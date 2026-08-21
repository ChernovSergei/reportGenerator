package model;

import org.apache.poi.xwpf.usermodel.UnderlinePatterns;

public class TextStyle {
    private String styleName;
    private int fontSize;
    private String fontFamily;
    private String fontColor;
    private boolean bold;
    private boolean italic;
    private UnderlinePatterns underlinePatterns;
    private boolean strikeTrough;

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public boolean isItalic() {
        return italic;
    }

    public void setItalic(boolean italic) {
        this.italic = italic;
    }

    public UnderlinePatterns getUnderlinePatterns() {
        return underlinePatterns;
    }

    public void setUnderlinePatterns(UnderlinePatterns underlinePatterns) {
        this.underlinePatterns = underlinePatterns;
    }

    public boolean isStrikeTrough() {
        return strikeTrough;
    }

    public void setStrikeTrough(boolean strikeTrough) {
        this.strikeTrough = strikeTrough;
    }

    public TextStyle(String styleName,
                     int fontSize,
                     String fontFamily,
                     String fontColor,
                     boolean bold,
                     boolean italic,
                     UnderlinePatterns underlinePattern,
                     boolean strikeTrough) {
        this.styleName = styleName;
        this.fontSize = fontSize;
        this.fontFamily = fontFamily;
        this.fontColor = fontColor;
        this.bold = bold;
        this.italic = italic;
        this.underlinePatterns = underlinePattern;
        this.strikeTrough = strikeTrough;
    }
}
