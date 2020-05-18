package org.tyaa.maven.demo.console;

import java.math.BigDecimal;

public class Product {
    public String name;
    public BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
