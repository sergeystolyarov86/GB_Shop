package ru.stolyarov.GB_Shop.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
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


    @Override
    public String toString() {
        return "Product:" +
                " id = " + id +
                ", title = '" + title + '\'' +
                ", coast = " + cost +
                ';';
    }
}


