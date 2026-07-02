import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;

interface EmailService {
    void sendEmail(String address, String message);
}

public class OrderServiceTest {

    @Test
    public void testVerifyInteraction() {
        // create mock
        EmailService mockEmail = Mockito.mock(EmailService.class);
        
        // call a method on the mock
        mockEmail.sendEmail("test@example.com", "Order Confirmed");
        
        // verify that the method was actually called with these exact parameters
        verify(mockEmail).sendEmail("test@example.com", "Order Confirmed");
        
        System.out.println("Interaction verification passed!");
    }
}
