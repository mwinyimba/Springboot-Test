package test.example.test.controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.example.test.models.Employee;
import test.example.test.models.Product;
import test.example.test.sevices.ProductServices;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    private ProductServices productServices;

    @PostMapping("/")
    public Product addProduct(@RequestBody Product s){
        return productServices.addProduct(s);
    }

    @GetMapping("/")
    public List<Product> getAll(){
        return productServices.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable Long id){
        return productServices.findById(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@RequestBody Product s,@PathVariable Long id){
        s.setId(id);
        return productServices.addProduct(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        productServices.deleteById(id);
    }
}
