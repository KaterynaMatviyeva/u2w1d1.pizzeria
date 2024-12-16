package it.epicode.u2w1d1.pizzeria.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "drinks")
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private int calories;
    private double price;

    public Drink() {}

    public Drink(Long id, String name, int calories, double price) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
