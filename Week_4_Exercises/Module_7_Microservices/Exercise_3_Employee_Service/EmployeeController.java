import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private DepartmentClient departmentClient;

    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable int id) {
        String dept = departmentClient.getDepartmentById(id == 1 ? 1 : 2);
        return "Employee ID: " + id + ", Department: " + dept;
    }
}
