package model;

public class Paragraph {

    private String text;
    private String styleParagraphId;

    public Paragraph(String text, String styleParagraphId) {
        this.text = text;
        this.styleParagraphId = styleParagraphId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStyleParagraphId() {
        return styleParagraphId;
    }

    public void setStyleParagraphId(String styleParagraphId) {
        this.styleParagraphId = styleParagraphId;
    }
}
