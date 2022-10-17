package test.example.test.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.example.test.models.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
