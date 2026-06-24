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
        
        DatabaseService mockDb = Mockito.mock(DatabaseService.class);

        when(mockDb.getData(1)).thenReturn("Fake User Data");

        String result = mockDb.getData(1);
        assertEquals("Fake User Data", result);
        
        System.out.println("Mocking test passed.");
    }
}
