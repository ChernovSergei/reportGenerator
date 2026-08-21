package service;

import model.ParagraphStyle;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import repository.Content;
import repository.ParagraphStyles;

public class DocContentGen {
    XWPFDocument doc;

    public DocContentGen(XWPFDocument doc) {
        this.doc = doc;
    }

    public void addContent(Content content) {
        ParagraphStyles paragraphStyles = new ParagraphStyles();
        content.generateContent().getAllParagraphs().forEach(p -> {
                    XWPFParagraph newParagraph = doc.createParagraph();
                    ParagraphStyle paragraphStyle = paragraphStyles.getParagraphStyles().get(p.getStyleParagraphId());
                    ParagraphDesigner.applyParagraphStyle(newParagraph, paragraphStyle);
                    XWPFRun run = newParagraph.createRun();
                    run.setText(p.getText());
                }
        );
    }
}