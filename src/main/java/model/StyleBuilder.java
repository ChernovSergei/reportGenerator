package model;

public class StyleBuilder {
    private String id;
    private String styleName;
    private Integer textSize;
    private String fontFamily;
    private String fontColor;
    private Boolean bold;
    private Boolean italic;
    private LineType lineType;
    private Boolean strike;

    public void setId(String id) {
        this.id = id;
    }

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

    public Style getResult() {
        return new Style(id,
                styleName,
                textSize,
                fontFamily,
                fontColor,
                bold,
                italic,
                lineType,
                strike);
    }
}
