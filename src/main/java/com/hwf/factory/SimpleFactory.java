package com.hwf.factory;

public class SimpleFactory {
    public static Product createProduct(String type){
        if("A".equals(type)){
            return new ProductA();
        }else if ("B".equals(type)){
            return new ProductB();
        }else {
            return new ProductOthers();
        }
    }

    public static void main(String[] args) {
        Product a = SimpleFactory.createProduct("A");
        a.produce();

        Product b = SimpleFactory.createProduct("B");
        b.produce();

        Product others = SimpleFactory.createProduct("others");
        others.produce();

        System.out.println("简单工厂模式");
    }
}
