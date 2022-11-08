package ru.stolyarov.GB_Shop.converters;

import org.springframework.stereotype.Component;
import ru.stolyarov.GB_Shop.data.Product;
import ru.stolyarov.GB_Shop.dto.ProductDto;

@Component
public class ProductConverter {
    public Product dtoToEntity(ProductDto productDto){
        return new Product(null,productDto.getTitle(),productDto.getCost());
    }
    public ProductDto entityToDto(Product product){
        return new ProductDto(product.getTitle(), product.getCost());
    }
}
