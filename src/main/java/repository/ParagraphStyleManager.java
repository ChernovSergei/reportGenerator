package repository;

import model.ParagraphStyleBuilder;
import org.apache.poi.xwpf.usermodel.TextAlignment;
import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;

public class ParagraphStyleManager {
    public static void createNormalStyle(String styleName, ParagraphStyleBuilder builder) {
        builder.setStyleName(styleName);
        builder.setBorderBetween(Borders.NONE);
        builder.setBorderBottom(Borders.NONE);
        builder.setBorderTop(Borders.NONE);
        builder.setBorderLeft(Borders.NONE);
        builder.setBorderRight(Borders.NONE);
        builder.setAlignment(ParagraphAlignment.LEFT);
        builder.setVerticalAlignment(TextAlignment.CENTER);
        builder.setSpacingBefore(1);
        builder.setSpacingAfter(1);
        builder.setSpacingBetween(1.0);
    }

    public static void createTitle1Style(String styleName, ParagraphStyleBuilder builder) {
        builder.setStyleName(styleName);
        builder.setBorderBetween(Borders.NONE);
        builder.setBorderBottom(Borders.NONE);
        builder.setBorderTop(Borders.NONE);
        builder.setBorderLeft(Borders.NONE);
        builder.setBorderRight(Borders.NONE);
        builder.setAlignment(ParagraphAlignment.RIGHT);
        builder.setVerticalAlignment(TextAlignment.CENTER);
        builder.setSpacingBefore(1);
        builder.setSpacingAfter(1);
        builder.setSpacingBetween(1.0);
    }
}