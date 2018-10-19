package com.amazayn.ecom.amazayn.models;

import javax.persistence.*;

@Entity
public class AddressType {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    private String description;
}
