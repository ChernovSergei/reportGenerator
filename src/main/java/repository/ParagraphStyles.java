package repository;

import model.ParagraphStyle;
import model.ParagraphStyleBuilder;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ParagraphStyles {
    ParagraphStyleBuilder normalStyleBuilder = new ParagraphStyleBuilder();
    ParagraphStyleBuilder title1StyleBuilder = new ParagraphStyleBuilder();

    private void generateParagraphStyles() {
        ParagraphStyleManager.createNormalStyle("Normal", normalStyleBuilder);
        ParagraphStyleManager.createTitle1Style("Title1", title1StyleBuilder);
    }

    public Map<String, ParagraphStyle> getParagraphStyles() {
        Map<String, ParagraphStyle> paragraphStyles = new HashMap();
        generateParagraphStyles();
        paragraphStyles.put("Normal", normalStyleBuilder.getResult());
        paragraphStyles.put("Title1", title1StyleBuilder.getResult());
        return paragraphStyles;
    }
}
