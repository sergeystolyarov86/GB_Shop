package ru.stolyarov.GB_Shop.services;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.stolyarov.GB_Shop.Product;
import ru.stolyarov.GB_Shop.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class ProductService {

    private final ProductRepository repository;

    public Product getProduct(Long id) {
        return repository.getProductById(id);
    }

    public List<Product> getAllProducts() {
        return repository.getProductsList();
    }

    public void changeCost(Long id, Double cost) {
        Product product = repository.getProductById(id);
        product.setCost(product.getCost() + cost);
    }

    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    public void deleteProduct(Long id) {
        repository.getProductsList().removeIf(p->p.equals(getProduct(id))) ;
    }
}
