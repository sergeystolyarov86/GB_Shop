package ru.stolyarov.GB_Shop.data;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "title")
    String title;
    @Column(name = "cost")
    double cost;

    public Product() {
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


