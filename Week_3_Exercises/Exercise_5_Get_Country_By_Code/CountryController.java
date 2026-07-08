import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/country/{code}")
    public String getCountryByCode(@PathVariable String code) {
        if ("IN".equalsIgnoreCase(code)) {
            return "India";
        } else if ("US".equalsIgnoreCase(code)) {
            return "United States";
        } else {
            return "Unknown Country Code";
        }
    }
}