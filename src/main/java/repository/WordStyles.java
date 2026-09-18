package repository;

import java.util.HashMap;
import java.util.Map;

import model.WordStyle;
import model.WordStyleBuilder;

public class WordStyles {
    WordStyleBuilder normalStyleBuilder = new WordStyleBuilder();

    public void generateTextStyles() {
        WordStylesManager.createNormalStyle("Normal", normalStyleBuilder);
    }

    public Map<String, WordStyle> getTextStyles() {
        Map<String, WordStyle> textStyles = new HashMap<>();
        generateTextStyles();
        textStyles.put("Normal", normalStyleBuilder.getResult());
        return textStyles;
    }

}
