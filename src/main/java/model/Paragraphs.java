package model;

import java.util.LinkedList;
import java.util.List;

public class Paragraphs {
    private List<Paragraph> paragraphs = new LinkedList<>();

    public void addParagraphToLast(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }

    public void deleteParagraph(int id) {
        paragraphs.remove(id);
    }

    public void addParagraphTo(Paragraph paragraph, int id) {
        paragraphs.add(id, paragraph);
    }

    public void modifyParagraph(Paragraph paragraph, int id) {
        paragraphs.set(id, paragraph);
    }

    public List<Paragraph> getAllParagraphs() {
        return paragraphs;
    }
}
