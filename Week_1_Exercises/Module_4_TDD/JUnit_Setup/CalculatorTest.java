import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    
    @Test
    public void testAddition() {
        int a = 10;
        int b = 20;
        int result = a + b;

        assertEquals(30, result, "Addition should work correctly");
        System.out.println("testAddition passed successfully.");
    }
}
