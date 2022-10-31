package ru.stolyarov.GB_Shop.services;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.stolyarov.GB_Shop.data.Product;
import ru.stolyarov.GB_Shop.repositories.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class ProductService {

    private final ProductRepository repository;

    public Product getProductById(Long id) {
        return repository.getById(id);
    }
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public void changeCost(Long id, Double cost) {
        Product product = repository.getById(id);
        product.setCost(product.getCost() + cost);
    }

//    public void addProduct(Product product) {
//        repository.;
//    }

    public void deleteProductById(Long id) {
        repository.deleteById(id) ;
    }
}
