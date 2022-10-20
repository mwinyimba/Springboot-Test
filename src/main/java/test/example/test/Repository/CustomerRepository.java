package test.example.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.example.test.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer , Long> {

}
