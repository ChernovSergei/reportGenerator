package repository;

import model.Paragraph;
import model.Paragraphs;

public class Content {
    Paragraphs paragraphs = new Paragraphs();

    public Paragraphs generateContent() {
        paragraphs.addParagraphToLast(
                new Paragraph("Machinery management",1));
        paragraphs.addParagraphToLast(
                new Paragraph("services", 1));
        return paragraphs;
    }
}