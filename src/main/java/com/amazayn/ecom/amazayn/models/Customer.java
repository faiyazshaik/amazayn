package com.amazayn.ecom.amazayn.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
   @Id
   @GeneratedValue
   @Column(name = "id")
    private  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public void seteMailAddress(String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
    @Column(name="emailaddress")
    private String eMailAddress;
    private String password;

    @OneToMany(targetEntity = Address.class, mappedBy = "id")
    private Set<Address> address;

    @OneToMany(targetEntity = Order.class, mappedBy = "id")
    private Set<Order> orderlist;

}
