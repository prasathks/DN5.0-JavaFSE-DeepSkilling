import java.util.Properties;

public class AppConfig {
    private Properties config = new Properties();
    private String dbUrl = "jdbc:mysql://localhost:3306/db";
    
    public AppConfig() {
        config.setProperty("timeout", "5000");
        config.setProperty("maxConnections", "100");
    }
    
    public String getDbUrl() { 
        return dbUrl; 
    }
    // Changes stashed and then popped during rebase workflow
}
