package repository;

import java.util.HashMap;
import java.util.Map;

import model.Style;
import model.StyleBuilder;

public class Styles {
    StyleBuilder normalStyleBuilder = new StyleBuilder();

    public void generateTextStyles() {
        StylesManager.createNormalStyle("Normal", normalStyleBuilder);
    }

    public Map<String, Style> getTextStyles() {
        Map<String, Style> textStyles = new HashMap<>();
        generateTextStyles();
        textStyles.put("Normal", normalStyleBuilder.getResult());
        return textStyles;
    }

}
