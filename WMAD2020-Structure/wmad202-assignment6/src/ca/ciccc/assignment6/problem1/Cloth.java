package ca.ciccc.assignment6.problem1;

import java.util.ArrayList;

public class Cloth extends Product{
    private ArrayList<Material> ClothMaterials = new ArrayList<>();

    public Cloth(Integer ProductId, String ProductName, Float ProductPrice, String ProductMadeInCountry, ArrayList<Material> ClothMaterials) {
        super(ProductId, ProductName, ProductPrice, ProductMadeInCountry);
        this.ClothMaterials = ClothMaterials;
    }
}
