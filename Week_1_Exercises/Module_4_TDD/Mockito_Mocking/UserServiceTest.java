import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

interface DatabaseService {
    String getData(int id);
}

public class UserServiceTest {

    @Test
    public void testMocking() {
        // creating a mock object of DatabaseService
        DatabaseService mockDb = Mockito.mock(DatabaseService.class);
        
        // stubbing the method to return a fake value
        when(mockDb.getData(1)).thenReturn("Fake User Data");
        
        // test the mocked method
        String result = mockDb.getData(1);
        assertEquals("Fake User Data", result);
        
        System.out.println("Mocking and stubbing test passed successfully.");
    }
}
