import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationLog {

    // getting the logger instance
    private static final Logger logger = LoggerFactory.getLogger(ApplicationLog.class);

    public static void main(String[] args) {
        
        logger.info("Application is starting...");
        
        try {
            int result = 10 / 0; // will cause ArithmeticException
        } catch (Exception e) {
            logger.error("An error occurred during division!", e);
        }
        
        logger.warn("Application is running with some issues.");
        logger.debug("Debugging details: variable values etc.");
    }
}
