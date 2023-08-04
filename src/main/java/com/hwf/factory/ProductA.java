package com.hwf.factory;

public class ProductA implements Product {

    @Override
    public void produce() {
        System.out.println("A");
    }
}
