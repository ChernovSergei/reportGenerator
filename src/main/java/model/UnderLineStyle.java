package model;

import java.util.Objects;

public class UnderLineStyle {
    private LineType lineType;
    private String color;

    public UnderLineStyle(LineType lineType, String color) {
        this.lineType = lineType;
        this.color = color;
    }

    public LineType getLineType() {
        return lineType;
    }

    public void setLineType(LineType lineType) {
        this.lineType = lineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UnderLineStyle that = (UnderLineStyle) o;
        return lineType == that.lineType && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineType, color);
    }
}
