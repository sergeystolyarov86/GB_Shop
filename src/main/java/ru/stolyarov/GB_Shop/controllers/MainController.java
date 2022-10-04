package ru.stolyarov.GB_Shop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.stolyarov.GB_Shop.services.ProductService;


@Controller
@RequiredArgsConstructor
public class MainController {
  private final ProductService productService;

    @GetMapping("/products")
    public String getProducts(Model model){
      model.addAttribute("productsFront",productService.getAllProducts());
      return "products.html";

    }

    @GetMapping("/product")
    public String getProductById(Model model,@RequestParam Long id){
      model.addAttribute("productFront",productService.getProduct(id));
      return "product.html";
    }





}
