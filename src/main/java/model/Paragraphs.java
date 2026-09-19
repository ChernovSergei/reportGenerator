package model;

import java.util.LinkedList;
import java.util.List;

public class Paragraphs {
    private List<Paragraph> paragraphs = new LinkedList<>();

    public void addParagraphToLast(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }

    public List<Paragraph> getAllParagraphs() {
        return paragraphs;
    }
}
