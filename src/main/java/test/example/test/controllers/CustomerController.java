package test.example.test.controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.*;
import test.example.test.models.Customer;
import test.example.test.models.Employee;
import test.example.test.sevices.CustomerServices;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
    private CustomerServices customerServices;


    @PostMapping("/")
    public Customer addCustomer(@RequestBody Customer customer){


        return customerServices.addCustomer(customer);
    }

    @GetMapping("/")
    public List<Customer> getAll(){
        return CustomerServices.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getById(@PathVariable Long id){
        return CustomerServices.findById(id);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@RequestBody Customer customer,@PathVariable Long id){
        customer.setId(id);
        return customerServices.addCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        customerServices.deleteById(id);
    }

}
