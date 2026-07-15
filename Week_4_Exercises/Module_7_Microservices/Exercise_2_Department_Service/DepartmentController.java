import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @GetMapping("/departments/{id}")
    public String getDepartment(@PathVariable int id) {
        if (id == 1) return "Engineering";
        if (id == 2) return "Human Resources";
        return "Unknown Department";
    }
}
