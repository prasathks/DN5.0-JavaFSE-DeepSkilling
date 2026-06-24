interface Document {
    void open();
}

class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document...");
    }
}

class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}

class DocumentFactory {

    public Document createDocument(String docType) {
        
        if (docType == null) {
            return null;
        }
        
        if (docType.equalsIgnoreCase("WORD")) {
            return new WordDocument();
            
        } else if (docType.equalsIgnoreCase("PDF")) {
            return new PdfDocument();
        }
        
        return null;
    }
}

public class DocumentFactoryExample {
    public static void main(String[] args) {
        
        DocumentFactory factory = new DocumentFactory();

        Document doc1 = factory.createDocument("WORD");
        doc1.open();

        Document doc2 = factory.createDocument("PDF");
        doc2.open();
    }
}
