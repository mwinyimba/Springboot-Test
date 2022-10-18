package test.example.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.example.test.models.Admin;
import test.example.test.models.Customer;

public interface AdminRepository extends JpaRepository<Admin , Long> {
}
