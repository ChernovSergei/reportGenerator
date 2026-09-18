package service;

import model.ParagraphStyle;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import repository.Content;
import repository.ParagraphStyles;
import repository.WordStyles;

public class DocContentGen {
    XWPFDocument doc;

    public DocContentGen(XWPFDocument doc) {
        this.doc = doc;
    }

    public void addContent(Content content) {
        WordStyles wordStyles = new WordStyles();
        WordStylesGathering styles = new WordStylesGathering(doc, wordStyles);
        styles.applyStylesIntoDocument();
        // ParagraphStyles paragraphStyles = new ParagraphStyles();
        content.generateContent().getAllParagraphs().forEach(p -> {
            XWPFParagraph newParagraph = doc.createParagraph();
            String pStyle = p.getStyleParagraphId();
            newParagraph.setStyle(pStyle);

            // ParagraphStyle paragraphStyle =
            // paragraphStyles.getParagraphStyles().get(p.getStyleParagraphId());
            // ParagraphDesigner.applyParagraphStyle(newParagraph, paragraphStyle);
            XWPFRun run = newParagraph.createRun();
            run.setText(p.getText());
        });
    }
}
