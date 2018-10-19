package com.amazayn.ecom.amazayn.models;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    private String firstLine;
    private String secondLine;
    private String thirdLine;
    private String city;
    private String postCode;
    private String country;
   @OneToOne
    @JoinColumn(name = "id")
    private AddressType addressType;
}
