package ru.stolyarov.GB_Shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.stolyarov.GB_Shop.data.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {


}
