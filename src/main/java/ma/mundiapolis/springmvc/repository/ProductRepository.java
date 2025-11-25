package ma.mundiapolis.springmvc.repository;

import ma.mundiapolis.springmvc.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
