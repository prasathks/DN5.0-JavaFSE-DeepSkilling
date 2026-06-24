import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AAATest {

    @BeforeEach
    public void setUp() {
        System.out.println("Setting up test environment...");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up test environment...");
    }

    @Test
    public void testStringLength() {
        
        String testStr = "JavaFSE";

        int length = testStr.length();

        assertEquals(7, length);
        System.out.println("testStringLength passed.");
    }
}
