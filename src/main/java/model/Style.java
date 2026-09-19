package model;

public class Style {
    private String id;
    private String styleName;
    private Integer textSize;
    private String fontFamily;
    private String fontColor;
    private Boolean bold;
    private Boolean italic;
    private LineType lineType;
    private Boolean strike;

    public Style(String id,
            String styleName,
            Integer textSize,
            String fontFamily,
            String fontColor,
            Boolean bold,
            Boolean italic,
            LineType lineType,
            Boolean strike) {
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Style other = (Style) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
