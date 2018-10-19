package com.amazayn.ecom.amazayn.models;

import javax.persistence.*;
import java.util.Date;

@Entity(name= "`ORDER`")
public class Order {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    private Date date;
    private int status;
   @ManyToOne(targetEntity = Customer.class)
    private Customer customer;
}
