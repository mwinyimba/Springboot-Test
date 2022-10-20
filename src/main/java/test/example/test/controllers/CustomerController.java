package test.example.test.controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.example.test.models.Customer;
import test.example.test.models.Employee;
import test.example.test.sevices.CustomerServices;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("api/customer")
public class CustomerController {
    @Autowired
    private CustomerServices customerServices;

    @PostMapping("/")
    public Customer addCustomer(@RequestBody Customer s){
        return customerServices.addCustomer(s);
    }

    @GetMapping("/")
    public List<Customer> getAll(){
        return customerServices.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getById(@PathVariable Long id){
        return customerServices.findById(id);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@RequestBody Customer s,@PathVariable Long id){
        s.setId(id);
        return customerServices.addCustomer(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        customerServices.deleteById(id);
    }
}
