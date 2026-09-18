package repository;

import model.Paragraph;
import model.Paragraphs;

public class Content {
    Paragraphs paragraphs = new Paragraphs();

    public Paragraphs generateContent() {
        paragraphs.addParagraphToLast(
                new Paragraph("Machinery management", "Normal"));
        paragraphs.addParagraphToLast(
                new Paragraph("services solar", "Normal"));
        return paragraphs;
    }
}
