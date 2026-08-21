package model;

import org.apache.poi.xwpf.usermodel.*;

public class ParagraphStyle {

    private String styleName;
    private Borders borderBottom;
    private Borders borderTop;
    private Borders borderRight;
    private Borders borderLeft;
    private Borders borderBetween;
    private ParagraphAlignment paragraphAlignment;
    private TextAlignment verticalAlignment;
    private Integer spacingBefore;
    private Integer spacingAfter;
    private Double spacingBetween;

    public ParagraphStyle(String styleName,
                          ParagraphAlignment paragraphAlignment,
                          Borders borderBottom,
                          Borders borderTop,
                          Borders borderRight,
                          Borders borderLeft,
                          Borders borderBetween,
                          TextAlignment verticalAlignment,
                          Integer spacingBefore,
                          Integer spacingAfter,
                          Double spacingBetween) {
        this.styleName = styleName;
        this.paragraphAlignment = paragraphAlignment;
        this.borderBottom = borderBottom;
        this.borderTop = borderTop;
        this.borderRight = borderRight;
        this.borderLeft = borderLeft;
        this.borderBetween = borderBetween;
        this.verticalAlignment = verticalAlignment;
        this.spacingAfter = spacingAfter;
        this.spacingBefore = spacingBefore;
        this.spacingBetween = spacingBetween;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public ParagraphAlignment getParagraphAlignment() {
        return paragraphAlignment;
    }

    public void setParagraphAlignment(ParagraphAlignment paragraphAlignment) {
        this.paragraphAlignment = paragraphAlignment;
    }

    public Borders getBorderBottom() {
        return borderBottom;
    }

    public void setBorderBottom(Borders borderBottom) {
        this.borderBottom = borderBottom;
    }

    public Borders getBorderTop() {
        return borderTop;
    }

    public void setBorderTop(Borders borderTop) {
        this.borderTop = borderTop;
    }

    public Borders getBorderRight() {
        return borderRight;
    }

    public void setBorderRight(Borders borderRight) {
        this.borderRight = borderRight;
    }

    public Borders getBorderLeft() {
        return borderLeft;
    }

    public void setBorderLeft(Borders borderLeft) {
        this.borderLeft = borderLeft;
    }

    public Borders getBorderBetween() {
        return borderBetween;
    }

    public void setBorderBetween(Borders borderBetween) {
        this.borderBetween = borderBetween;
    }

    public TextAlignment getVerticalAlignment() {
        return verticalAlignment;
    }

    public void setVerticalAlignment(TextAlignment verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
    }

    public Integer getSpacingBefore() {
        return spacingBefore;
    }

    public void setSpacingBefore(Integer spacingBefore) {
        this.spacingBefore = spacingBefore;
    }

    public Integer getSpacingAfter() {
        return spacingAfter;
    }

    public void setSpacingAfter(Integer spacingAfter) {
        this.spacingAfter = spacingAfter;
    }

    public Double getSpacingBetween() {
        return spacingBetween;
    }

    public void setSpacingBetween(Double spacingBetween) {
        this.spacingBetween = spacingBetween;
    }

    public void setParagraphStyle(XWPFParagraph paragraph) {
        paragraph.setBorderBottom(borderBottom);
        paragraph.setBorderTop(borderTop);
        paragraph.setBorderBetween(borderBetween);
        paragraph.setBorderLeft(borderLeft);
        paragraph.setBorderRight(borderRight);
        paragraph.setAlignment(paragraphAlignment);
        paragraph.setVerticalAlignment(verticalAlignment);
        paragraph.setSpacingAfter(spacingAfter);
        paragraph.setSpacingBefore(spacingBefore);
        paragraph.setSpacingBetween(spacingBetween);
    }
}