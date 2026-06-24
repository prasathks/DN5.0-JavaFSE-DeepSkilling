import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;

interface EmailService {
    void sendEmail(String address, String message);
}

public class OrderServiceTest {

    @Test
    public void testVerifyInteraction() {
        
        EmailService mockEmail = Mockito.mock(EmailService.class);

        mockEmail.sendEmail("test@example.com", "Order Confirmed");

        verify(mockEmail).sendEmail("test@example.com", "Order Confirmed");
        
        System.out.println("Interaction verification passed!");
    }
}
