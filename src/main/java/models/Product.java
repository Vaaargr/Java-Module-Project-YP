package models;

import java.math.BigDecimal;

public class Product {
    private String name;
    private String price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        setPrice(price);
    }

    private void setPrice(BigDecimal price) {
        this.price = price.toString();
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return new BigDecimal(price);
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}
