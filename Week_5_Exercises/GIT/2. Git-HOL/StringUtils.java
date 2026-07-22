public class StringUtils {
    public boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
    
    public String reverse(String str) {
        if (isNullOrEmpty(str)) return str;
        return new StringBuilder(str).reverse().toString();
    }
    // Feature branch implementation for string manipulation utilities
}
