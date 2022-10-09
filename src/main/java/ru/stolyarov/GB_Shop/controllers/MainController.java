package ru.stolyarov.GB_Shop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.stolyarov.GB_Shop.Product;
import ru.stolyarov.GB_Shop.services.ProductService;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class MainController {
    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

//    @GetMapping("/product")
//    public String getProductById(Model model, @RequestParam Long id) {
//        model.addAttribute("productFront", productService.getProduct(id));
//        return "product.html";
//    }

    @GetMapping("/product/change_cost")
    public void changeCost(@RequestParam Long productId, @RequestParam Double delta) {
        productService.changeCost(productId, delta);
    }

//    @GetMapping("/show_page")
//    public String form(Long id, String title, Double cost) {
//        return "simple_form";
//    }

    @PostMapping("/product/add")
    public void addProductPost(@RequestBody Product product) {
        productService.addProduct(product);
    }

    // еще не доделал,не успеваю
    @GetMapping ("/product/delete/{id}")
    public void delete(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
