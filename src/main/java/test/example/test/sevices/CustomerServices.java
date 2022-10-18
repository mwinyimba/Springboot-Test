package test.example.test.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.example.test.Repository.CusmtomerRepository;
import test.example.test.models.Customer;
import test.example.test.models.Employee;

import java.util.List;
import java.util.Optional;

@Service

public class CustomerServices {
    @Autowired
    private static CusmtomerRepository cusmtomerRepository;

    public static List<Customer> getAll() {
        return  cusmtomerRepository.findAll();
    }

    public static Optional<Customer> findById(Long id) {
        return cusmtomerRepository.findById(id);
    }

    public Customer addCustomer(Customer customer) {
        return  cusmtomerRepository.save(customer);
    }

    public void deleteById(Long id) {
        cusmtomerRepository.deleteById(id);
    }
}
