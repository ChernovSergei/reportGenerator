package repository;

import model.FontFamily;
import model.LineType;
import model.StyleBuilder;

public class StylesManager {
    public static void createNormalStyle(String styleName, StyleBuilder builder) {
        builder.setId("Normal");
        builder.setStyleName("Normal");
        builder.setFontFamily(FontFamily.TAHOMA.getName());
        builder.setTextSize(12);
        builder.setFontColor("000000");
        builder.setBold(true);
        builder.setItalic(true);
        builder.setUnderLine(LineType.DOUBLE);
        builder.setStrike(false);
    }
}
