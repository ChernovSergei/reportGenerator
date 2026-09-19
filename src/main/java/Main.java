import service.Document;

public class Main {
    // Comment
    // TODO: Pefrom refactoring
    // TODO: Remove unused classes
    public static void main(String[] args) {
        Document document = new Document();
        try {
            document.createDocument("simple.docx");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
