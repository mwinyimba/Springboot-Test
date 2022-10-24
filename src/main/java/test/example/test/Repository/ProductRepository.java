package test.example.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.example.test.models.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product , Long> {
}
