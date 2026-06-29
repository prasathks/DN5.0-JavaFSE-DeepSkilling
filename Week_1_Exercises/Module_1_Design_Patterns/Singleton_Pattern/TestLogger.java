// Testing the Logger Singleton class
public class TestLogger {

    public static void main(String[] args) {
        
        // get the logger instance for first time
        Logger logger1 = Logger.getInstance();
        
        // get the logger instance again
        Logger logger2 = Logger.getInstance();
        
        // test the log method
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");
        
        // checking if both objects are exactly the same instance in memory
        if(logger1 == logger2) {
            System.out.println("Success: Both logger1 and logger2 are the exact same instance!");
        } else {
            System.out.println("Error: They are different instances.");
        }
        
    }
}
