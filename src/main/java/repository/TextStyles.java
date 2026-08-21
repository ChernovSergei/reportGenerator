package repository;

import model.TextStyle;
import model.TextStyleBuilder;
import java.util.HashMap;
import java.util.Map;

public class TextStyles {
    TextStyleBuilder normalStyleBuilder = new TextStyleBuilder();

    private void generateTextStyles() {
        TextStyleManager.createNormalStyle("Normal", normalStyleBuilder);
    }

    public Map<String, TextStyle> getTextStyles() {
        Map<String, TextStyle> textStyles = new HashMap<>();
        generateTextStyles();
        textStyles.put("Normal", normalStyleBuilder.getResult());
        return textStyles;
    }
}
