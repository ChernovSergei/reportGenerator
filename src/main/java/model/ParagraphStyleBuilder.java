package model;

import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.TextAlignment;

public class ParagraphStyleBuilder {

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

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public void setBorderBottom(Borders borderBottom) {
        this.borderBottom = borderBottom;
    }

    public void setBorderTop(Borders borderTop) {
        this.borderTop = borderTop;
    }

    public void setBorderRight(Borders borderRight) {
        this.borderRight = borderRight;
    }

    public void setBorderLeft(Borders borderLeft) {
        this.borderLeft = borderLeft;
    }

    public void setBorderBetween(Borders borderBetween) {
        this.borderBetween = borderBetween;
    }

    public void setAlignment(ParagraphAlignment paragraphAlignment) {
        this.paragraphAlignment = paragraphAlignment;
    }

    public void setVerticalAlignment(TextAlignment verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
    }

    public void setSpacingBefore(Integer spacingBefore) {
        this.spacingBefore = spacingBefore;
    }

    public void setSpacingAfter(Integer spacingAfter) {
        this.spacingAfter = spacingAfter;
    }

    public void setSpacingBetween(Double spacingBetween) {
        this.spacingBetween = spacingBetween;
    }

    public ParagraphStyle getResult() {
        return new ParagraphStyle(styleName,
                paragraphAlignment,
                borderBottom,
                borderTop,
                borderRight,
                borderLeft,
                borderBetween,
                verticalAlignment,
                spacingBefore,
                spacingAfter,
                spacingBetween);
    }
}