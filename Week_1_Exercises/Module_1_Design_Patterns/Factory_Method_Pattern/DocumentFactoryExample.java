// Interface for all documents
interface Document {
    void open();
}

// Word Document implementation
class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document...");
    }
}

// PDF Document implementation
class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}

// Factory class to create documents based on input
class DocumentFactory {
    
    // factory method to generate object of concrete class
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

// Main class to test the factory method pattern
public class DocumentFactoryExample {
    public static void main(String[] args) {
        
        DocumentFactory factory = new DocumentFactory();
        
        // create a word document and open it
        Document doc1 = factory.createDocument("WORD");
        doc1.open();
        
        // create a pdf document and open it
        Document doc2 = factory.createDocument("PDF");
        doc2.open();
    }
}
