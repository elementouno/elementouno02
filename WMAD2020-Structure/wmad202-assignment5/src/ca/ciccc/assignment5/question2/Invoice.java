package ca.ciccc.assignment5.question2;

import java.util.ArrayList;

public class Invoice {
    private ArrayList<Product> ProductList;
    private Integer totalProducts;

    Invoice(ArrayList<Product> Products, Integer TotalProducts) {
        this.ProductList = Products;
        this.totalProducts = TotalProducts;
    }

    Invoice() {
        this.ProductList = new ArrayList<Product>();
        this.totalProducts = 0;
    }

    public void addItem(Product p) {
        ProductList.add(p);
    }

    public void showList() {
        for(int i = 0; i < ProductList.size(); i++) {
            Product p = ProductList.get(i);
            System.out.println(p.name);
            System.out.println(p.price);
        }
    }
}
