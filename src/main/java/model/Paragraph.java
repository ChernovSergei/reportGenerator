package model;

public class Paragraph {

    private String text;
    private int styleParagraphId;

    public Paragraph(String text, int styleParagraphId) {
        this.text = text;
        this.styleParagraphId = styleParagraphId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getStyleParagraphId() {
        return styleParagraphId;
    }

    public void setStyleParagraphId(int styleParagraphId) {
        this.styleParagraphId = styleParagraphId;
    }
}
