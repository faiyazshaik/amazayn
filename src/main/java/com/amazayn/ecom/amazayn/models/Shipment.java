package com.amazayn.ecom.amazayn.models;

import org.aspectj.weaver.ast.Or;

public class Shipment {
    private int id;
    private Order order;
    private Address shippingAddress;
    private int status;
}
