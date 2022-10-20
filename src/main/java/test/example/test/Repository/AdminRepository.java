package test.example.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.example.test.models.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin , Long> {
}
