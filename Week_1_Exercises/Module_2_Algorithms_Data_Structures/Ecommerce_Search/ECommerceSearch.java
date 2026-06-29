import java.util.Arrays;
import java.util.Comparator;

// class to represent a Product in e-commerce
class Product {
    int productId;
    String productName;
    String category;

    // simple constructor
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class ECommerceSearch {

    // Linear search method to find a product by name
    public static Product linearSearch(Product[] productList, String targetName) {
        
        // loop through all items one by one
        for (int i = 0; i < productList.length; i++) {
            if (productList[i].productName.equalsIgnoreCase(targetName)) {
                return productList[i]; // found it
            }
        }
        return null; // return null if not found
    }

    // Binary search method (array must be sorted)
    public static Product binarySearch(Product[] productList, String targetName) {
        int left = 0;
        int right = productList.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = productList[mid].productName.compareToIgnoreCase(targetName);

            if (result == 0) {
                return productList[mid]; // found the product
            } else if (result < 0) {
                left = mid + 1; // target is in right half
            } else {
                right = mid - 1; // target is in left half
            }
        }
        return null; // not found
    }

    public static void main(String[] args) {
        
        // create some dummy products
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Smartphone", "Electronics"),
            new Product(103, "Tablet", "Electronics"),
            new Product(104, "Headphones", "Audio"),
            new Product(105, "Smartwatch", "Wearable")
        };

        // For binary search, we need to sort the array first by product name
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.productName.compareToIgnoreCase(p2.productName);
            }
        });

        // test linear search
        System.out.println("Testing Linear Search:");
        Product result1 = linearSearch(products, "Tablet");
        if (result1 != null) {
            System.out.println("Product found: " + result1.productName + " (ID: " + result1.productId + ")");
        } else {
            System.out.println("Product not found.");
        }

        // test binary search
        System.out.println("\nTesting Binary Search:");
        Product result2 = binarySearch(products, "Laptop");
        if (result2 != null) {
            System.out.println("Product found: " + result2.productName + " (ID: " + result2.productId + ")");
        } else {
            System.out.println("Product not found.");
        }
    }
}
