package ca.ciccc.assignment6.problem1;

public class Drink extends Product {
    private boolean isDrinkDiet;
    private Integer DrinkSize;
    public Drink(Integer DrinkId, String DrinkName, Float DrinkPrice, String DrinkMadeInCountry, boolean isDrinkDiet, Integer DrinkSize) {
        super(DrinkId, DrinkName, DrinkPrice, DrinkMadeInCountry);
        this.isDrinkDiet = isDrinkDiet;
        this.DrinkSize = DrinkSize;
    }
}