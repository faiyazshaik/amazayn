package com.amazayn.ecom.amazayn.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class ProductCategory {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    private String description;
}
