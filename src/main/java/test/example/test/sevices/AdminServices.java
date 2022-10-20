package test.example.test.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.example.test.Repository.AdminRepository;
import test.example.test.models.Admin;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServices {
    @Autowired
    private static AdminRepository adminRepository;

    public List<Admin> getAll() {
        return adminRepository.findAll();
    }

    public Optional<Admin> findById(Long id) {
        return  adminRepository.findById(id);
    }

    public static Admin addAdmin(Admin s) {
        return adminRepository.save(s);
    }

    public void deleteById(Long id) {
        adminRepository.deleteById(id);
    }
}
