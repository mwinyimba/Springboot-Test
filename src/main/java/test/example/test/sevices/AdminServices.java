package test.example.test.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.example.test.Repository.AdminRepository;
import test.example.test.models.Admin;
import test.example.test.models.Employee;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServices {
    @Autowired
    private AdminRepository adminRepository;
    public Admin addAdmin(Admin s) {
        return  adminRepository.save(s);

    }

    public List<Admin> getAll() {
        return  adminRepository.findAll();
    }

    public Optional<Admin> findById(Long id) {
        return  adminRepository.findById(id);
    }

    public void deleteById(Long id) {
        adminRepository.deleteById(id);
    }
}
