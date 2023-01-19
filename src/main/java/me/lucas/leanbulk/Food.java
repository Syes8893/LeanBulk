package me.lucas.leanbulk;

import java.util.Objects;

public class Food {

    private String productName;
    private int calories;
    private double fats;
    private double saturatedFats;
    private double carbs;
    private double sugars;
    private double protein;
    private double salt;

    public Food(String productName, int calories, double fats, double saturatedFats, double carbs, double sugars, double protein, double salt) {
        this.productName = productName;
        this.calories = calories;
        this.fats = fats;
        this.saturatedFats = saturatedFats;
        this.carbs = carbs;
        this.sugars = sugars;
        this.protein = protein;
        this.salt = salt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return calories == food.calories && Double.compare(food.fats, fats) == 0 && Double.compare(food.saturatedFats, saturatedFats) == 0 && Double.compare(food.carbs, carbs) == 0 && Double.compare(food.sugars, sugars) == 0 && Double.compare(food.protein, protein) == 0 && Double.compare(food.salt, salt) == 0 && Objects.equals(productName, food.productName);
    }

}
