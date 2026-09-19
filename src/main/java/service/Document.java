package service;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFStyle;
import org.apache.poi.xwpf.usermodel.XWPFStyles;

import repository.Content;
import repository.Styles;
import java.io.FileOutputStream;

public class Document {
    private final XWPFDocument document = new XWPFDocument();
    private final Content content = new Content();
    private final WordStylesAdapter stylesAdapter = new WordStylesAdapter(document);

    public void createDocument(String docName) throws Exception {
        try (document) {
            // WordStylesAdapter stylesAdapter = new WordStylesAdapter(document, styles);
            // stylesAdapter.applyStylesIntoDocument();
            addStylesToDocument();
            fillDocument();
            try (FileOutputStream out = new FileOutputStream(docName)) {
                document.write(out);
            }
        }
    }

    public void addStylesToDocument() {
        stylesAdapter.convertStylesToWordStyles();
    }

    public void fillDocument() {
        content.generateContent().getAllParagraphs().forEach(p -> {
            XWPFParagraph newParagraph = document.createParagraph();
            String pStyle = p.getStyle();
            newParagraph.setStyle(pStyle);
            XWPFRun run = newParagraph.createRun();
            run.setText(p.getText());
        });
    }

}
