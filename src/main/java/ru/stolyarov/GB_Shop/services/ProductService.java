package ru.stolyarov.GB_Shop.services;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.stolyarov.GB_Shop.converters.ProductConverter;
import ru.stolyarov.GB_Shop.data.Product;
import ru.stolyarov.GB_Shop.dto.ProductDto;
import ru.stolyarov.GB_Shop.repositories.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class ProductService {

    private final ProductRepository repository;
    private final ProductConverter productConverter;

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

//    public void changeCost(Long id, Double cost) {
//        Product product = repository.getById(id);
//        product.setCost(product.getCost() + cost);
//    }



    public void deleteById(Long id) {
        repository.deleteById(id) ;
    }

    public Product addProduct(Product product) {
        repository.save(product);
        return product;
    }

    public ProductDto findById(Long id) {
       return repository.findById(id).map(productConverter::entityToDto).orElseThrow();
    }
}
