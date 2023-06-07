package models;

import java.math.BigDecimal;
import java.util.LinkedList;

import models.Product;

public class Bill {
    private int peopleCount;
    private LinkedList<Product> listOfProducts = new LinkedList<>();

    public Bill(int peopleCount){
        this.peopleCount = peopleCount;
    }
    public int getPeopleCount() {
        return peopleCount;
    }
    public LinkedList<Product> getListOfProducts() {
        return listOfProducts;
    }
    public void addProduct(Product product){
        listOfProducts.add(product);
    }
}

