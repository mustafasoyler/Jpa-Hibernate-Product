package com.mustafa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Brand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int brandId;

    private String name;

    @OneToMany(mappedBy = "brand")
    private List<Product> products;

    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
    }

    public int getBrandId() {
        return brandId;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", name='" + name + '\'' +
                '}';
    }
}
