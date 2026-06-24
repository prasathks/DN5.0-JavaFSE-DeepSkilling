import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class ECommerceSearch {

    public static Product linearSearch(Product[] productList, String targetName) {

        for (int i = 0; i < productList.length; i++) {
            if (productList[i].productName.equalsIgnoreCase(targetName)) {
                return productList[i]; 
            }
        }
        return null; 
    }

    public static Product binarySearch(Product[] productList, String targetName) {
        int left = 0;
        int right = productList.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = productList[mid].productName.compareToIgnoreCase(targetName);

            if (result == 0) {
                return productList[mid]; 
            } else if (result < 0) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return null; 
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Smartphone", "Electronics"),
            new Product(103, "Tablet", "Electronics"),
            new Product(104, "Headphones", "Audio"),
            new Product(105, "Smartwatch", "Wearable")
        };

        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.productName.compareToIgnoreCase(p2.productName);
            }
        });

        System.out.println("Testing Linear Search:");
        Product result1 = linearSearch(products, "Tablet");
        if (result1 != null) {
            System.out.println("Product found: " + result1.productName + " (ID: " + result1.productId + ")");
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\nTesting Binary Search:");
        Product result2 = binarySearch(products, "Laptop");
        if (result2 != null) {
            System.out.println("Product found: " + result2.productName + " (ID: " + result2.productId + ")");
        } else {
            System.out.println("Product not found.");
        }
    }
}
