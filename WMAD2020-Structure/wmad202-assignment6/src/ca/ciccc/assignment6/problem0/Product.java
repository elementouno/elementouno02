package ca.ciccc.assignment6.problem0;

public class Product extends Object {
    private Integer ProductId;
    private String ProductName;
    private Float PoductPrice;
    private String ProductMadeInCountry;

    Product(Integer ProductId, String ProductName, Float ProductPrice, String ProductMadeInCountry) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.PoductPrice = ProductPrice;
        this.ProductMadeInCountry = ProductMadeInCountry;
    }
}
