import service.DocCreator;

public class Main {
    public static void main(String[] args) {
        DocCreator docCreator = new DocCreator();
        try {
            docCreator.createDoc("simple.docx");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}