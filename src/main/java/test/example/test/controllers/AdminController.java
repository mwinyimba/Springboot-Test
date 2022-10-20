package test.example.test.controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.example.test.models.Admin;
import test.example.test.models.Employee;
import test.example.test.sevices.AdminServices;

import java.util.List;
import java.util.Optional;
@CrossOrigin

@RestController
@RequestMapping("api/admin")
public class AdminController {
    @Autowired
    private AdminServices adminServices;
    @PostMapping("/")
    public Admin addAdmin(@RequestBody Admin s){
       return adminServices.addAdmin(s);
    }

    @GetMapping("/")
    public List<Admin> getAll(){
        return adminServices.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Admin> getById(@PathVariable Long id){
        return adminServices.findById(id);
    }

    @PutMapping("/{id}")
    public Admin updateAdmin(@RequestBody Admin s,@PathVariable Long id){
        s.setId(id);
        return adminServices.addAdmin(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        adminServices.deleteById(id);
    }
}
