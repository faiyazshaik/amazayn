package com.amazayn.ecom.amazayn.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


public class Product {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    private String name;
    private double price;
    @OneToMany(targetEntity = ProductCategory.class, mappedBy = "id")
    private Set<ProductCategory> productCategoryList;
}
