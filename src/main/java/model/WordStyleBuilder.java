package model;

public class WordStyleBuilder {
    private String styleName;
    private Integer textSize;
    private String fontFamily;
    private String fontColor;
    private Boolean bold;
    private Boolean italic;
    private LineType lineType;
    private Boolean strike;

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public void setTextSize(Integer textSize) {
        this.textSize = textSize;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    public void setItalic(Boolean italic) {
        this.italic = italic;
    }

    public void setUnderLine(LineType lineType) {
        this.lineType = lineType;
    }

    public void setStrike(Boolean strike) {
        this.strike = strike;
    }

    public WordStyle getResult() {
        return new WordStyle(styleName,
                textSize,
                fontFamily,
                fontColor,
                bold,
                italic,
                lineType,
                strike);
    }
}
