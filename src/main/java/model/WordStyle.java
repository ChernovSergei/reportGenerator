package model;

import java.util.Objects;

public class WordStyle {
    private String styleName;
    private Integer textSize;
    private String fontFamily;
    private String fontColor;
    private Boolean bold;
    private Boolean italic;
    private LineType lineType;
    private Boolean strike;

    public WordStyle(String styleName,
            Integer textSize,
            String fontFamily,
            String fontColor,
            Boolean bold,
            Boolean italic,
            LineType lineType,
            Boolean strike) {
        this.styleName = styleName;
        this.textSize = textSize;
        this.fontFamily = fontFamily;
        this.fontColor = fontColor;
        this.bold = bold;
        this.italic = italic;
        this.lineType = lineType;
        this.strike = strike;
    }

    public String getStyleName() {
        return styleName;
    }

    public Integer getTextSize() {
        return textSize;
    }

    public void setTextSize(Integer textSize) {
        this.textSize = textSize;
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

    public Boolean getBold() {
        return bold;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    public Boolean getItalic() {
        return italic;
    }

    public void setItalic(Boolean italic) {
        this.italic = italic;
    }

    public LineType getLineType() {
        return lineType;
    }

    public void setLineType(LineType lineType) {
        this.lineType = lineType;
    }

    public Boolean getStrike() {
        return strike;
    }

    public void setStrike(Boolean strike) {
        this.strike = strike;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        WordStyle wordStyle = (WordStyle) o;
        return Objects.equals(styleName, wordStyle.styleName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(styleName);
    }
}
