package repository;

import model.FontFamily;
import model.LineType;
import model.WordStyleBuilder;

public class WordStylesManager {
    public static void createNormalStyle(String styleName, WordStyleBuilder builder) {
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
