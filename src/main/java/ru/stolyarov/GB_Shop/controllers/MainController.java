package ru.stolyarov.GB_Shop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.stolyarov.GB_Shop.data.Product;
import ru.stolyarov.GB_Shop.dto.ProductDto;
import ru.stolyarov.GB_Shop.services.ProductService;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class MainController {
    private final ProductService productService;

    @GetMapping()
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }

    @PostMapping()
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/{id}")
    public ProductDto findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        productService.deleteById(id);
    }

}
