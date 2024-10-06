
package com.example.api_flutter.repository;
import com.example.api_flutter.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Integer> {
}

