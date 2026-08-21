package service;

import model.ParagraphStyle;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class ParagraphDesigner {
    public static void applyParagraphStyle(XWPFParagraph paragraph, ParagraphStyle paragraphStyle) {
        paragraph.setBorderBottom(paragraphStyle.getBorderBottom());
        paragraph.setBorderTop(paragraphStyle.getBorderTop());
        paragraph.setBorderBetween(paragraphStyle.getBorderBetween());
        paragraph.setBorderLeft(paragraphStyle.getBorderLeft());
        paragraph.setBorderRight(paragraphStyle.getBorderRight());
        paragraph.setAlignment(paragraphStyle.getParagraphAlignment());
        paragraph.setVerticalAlignment(paragraphStyle.getVerticalAlignment());
        paragraph.setSpacingAfter(paragraphStyle.getSpacingAfter());
        paragraph.setSpacingBefore(paragraphStyle.getSpacingBefore());
        paragraph.setSpacingBetween(paragraphStyle.getSpacingBetween());
    }
}
