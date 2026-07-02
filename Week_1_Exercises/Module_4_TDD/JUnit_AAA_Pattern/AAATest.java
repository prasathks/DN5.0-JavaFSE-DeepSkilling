import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AAATest {
    
    // Setup method runs before each test
    @BeforeEach
    public void setUp() {
        System.out.println("Setting up test environment...");
    }
    
    // Teardown method runs after each test
    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up test environment...");
    }

    @Test
    public void testStringLength() {
        // Arrange (setup data)
        String testStr = "JavaFSE";
        
        // Act (perform action)
        int length = testStr.length();
        
        // Assert (verify result)
        assertEquals(7, length);
        System.out.println("testStringLength passed.");
    }
}
