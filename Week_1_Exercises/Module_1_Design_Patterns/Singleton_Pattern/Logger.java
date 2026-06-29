// Logger class to demonstrate Singleton pattern
public class Logger {
    
    // static variable to hold one instance of Logger
    private static Logger instance;
    
    // private constructor so no one else can make a new one
    private Logger() {
        // empty constructor
    }
    
    // method to get the single instance
    public static Logger getInstance() {
        
        // check if instance is null before creating
        if (instance == null) {
            instance = new Logger();
        }
        
        return instance;
    }
    
    // simple method to write log messages
    public void log(String msg) {
        System.out.println("Log Message : " + msg);
    }
}
