package ru.stolyarov.GB_Shop;


import lombok.Data;

@Data
public class Product {
    Long id;
    String title;
    double cost;

    public Product() {
    }

    public Product(long id, String title, double coast) {
        this.id = id;
        this.title = title;
        this.cost = coast;
    }

    @Override
    public String toString() {
        return "Product:" +
                " id = " + id +
                ", title = '" + title + '\'' +
                ", coast = " + cost +
                ';';
    }
}


