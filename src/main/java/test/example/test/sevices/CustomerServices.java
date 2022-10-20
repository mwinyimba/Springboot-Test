package test.example.test.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.example.test.Repository.CustomerRepository;
import test.example.test.models.Customer;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerServices {
    @Autowired
    private CustomerRepository customerRepository;
    public Customer addCustomer(Customer s) {
        return customerRepository.save(s);

    }

    public List<Customer> getAll() {
        return  customerRepository.findAll();
    }

    public Optional<Customer> findById(Long id) {
        return  findById(id);
    }

    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }
}
