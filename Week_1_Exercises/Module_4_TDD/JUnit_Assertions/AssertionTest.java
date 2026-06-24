import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionTest {
    
    @Test
    public void testVariousAssertions() {
        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = null;

        assertEquals(str1, str2);

        assertNull(str3);
        assertNotNull(str1);

        assertTrue(5 > 3);
        assertFalse(5 < 3);
        
        System.out.println("All assertions passed!");
    }
}
