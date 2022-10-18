package test.example.test.sevices;

import test.example.test.Repository.AdminRepository;
import test.example.test.models.Admin;

import java.util.List;
import java.util.Optional;

public class AdminServices {
    private static AdminRepository adminRepo;

    public static List<Admin> getAll() {
        return adminRepo.findAll();
    }

    public static Optional<Admin> findById(Long id) {
        return adminRepo.findById(id);
    }

    public Admin addAdmin(Admin admin) {
        return  adminRepo.save(admin);
    }

    public void deleteById(Long id) {
        adminRepo.deleteById(id);
    }
}
