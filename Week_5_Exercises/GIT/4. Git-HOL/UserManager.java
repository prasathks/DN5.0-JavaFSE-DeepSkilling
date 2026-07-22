import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<String> users = new ArrayList<>();
    
    public void createUser(String name) {
        users.add(name);
        System.out.println("User " + name + " created successfully.");
    }
    
    public void deleteUser(String name) {
        users.remove(name);
    }
    // Cherry-picked hotfix from release branch for user management
}
