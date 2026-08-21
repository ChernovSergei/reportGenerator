package repository;

import model.TextStyleBuilder;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;

public class TextStyleManager {
    public static void createNormalStyle(String styleName, TextStyleBuilder builder) {
        builder.setStyleName(styleName);
        builder.setFontSize(20);
        builder.setFontFamily("Arial");
        builder.setFontColor("FF0000");
        builder.setBold(false);
        builder.setItalic(false);
        builder.setUnderlinePatterns(UnderlinePatterns.NONE);
        builder.setStrikeTrough(false);
    }
}
