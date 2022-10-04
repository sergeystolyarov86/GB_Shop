package ru.stolyarov.GB_Shop.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.stolyarov.GB_Shop.Product;
import ru.stolyarov.GB_Shop.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public Product getProduct(Long id){
        return repository.getProductById(id);
    }

    public List<Product> getAllProducts(){
        return repository.getProductsList();
    }

}
