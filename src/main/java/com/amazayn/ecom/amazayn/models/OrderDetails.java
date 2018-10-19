package com.amazayn.ecom.amazayn.models;

import org.springframework.web.bind.annotation.Mapping;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

public class OrderDetails {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @OneToOne
    @JoinColumn(name = "id")
    private Order order;
    @ManyToOne(targetEntity = Product.class)
    private Set<Product> productList;
}
