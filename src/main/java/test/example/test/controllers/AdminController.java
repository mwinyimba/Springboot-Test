package test.example.test.controllers;


import org.springframework.web.bind.annotation.*;
import test.example.test.models.Admin;
import test.example.test.models.Customer;
import test.example.test.sevices.AdminServices;
import test.example.test.sevices.CustomerServices;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/admin")
public class AdminController {
    private AdminServices adminServices;
    @PostMapping("/")
    public Admin addAdmin(@RequestBody Admin admin){

        return adminServices.addAdmin(admin);
    }
    @GetMapping
    public List<Admin> getAll() {return  AdminServices.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Admin> getById(@PathVariable Long id){
        return AdminServices.findById(id);
    }

    @PutMapping("/{id}")
    public Admin updateAdmin(@io.swagger.v3.oas.annotations.parameters.RequestBody Admin admin, @PathVariable Long id){
        admin.setId(id);
        return adminServices.addAdmin(admin);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        adminServices.deleteById(id);
    }



}
