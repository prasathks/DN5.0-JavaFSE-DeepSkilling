import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/authenticate")
    public String authenticate(@RequestBody UserCredentials credentials) {
        if ("admin".equals(credentials.getUsername()) && "password".equals(credentials.getPassword())) {
            return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTcxOTU5NjQxN30.FakeSignature123";
        }
        throw new RuntimeException("Invalid credentials");
    }
}

class UserCredentials {
    private String username;
    private String password;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}