package service;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import repository.Content;

import java.io.FileOutputStream;

public class DocCreator {

    public void createDoc(String docName) throws Exception {
        try (XWPFDocument doc = new XWPFDocument()) {
            DocContentGen docContentGen = new DocContentGen(doc);
            Content content = new Content();
            docContentGen.addContent(content);
            try (FileOutputStream out = new FileOutputStream(docName)) {
                doc.write(out);
            }
        }
    }
}
