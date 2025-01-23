package org.ies.animals.model;

import java.util.Objects;

public class Cat extends Animal {
    private String color;

    public Cat(int edad, String color) {
        super(edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void talk() {
        System.out.println("miau");
    }

    @Override
    public void showInfo() {
        System.out.println("Gato:");
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Color: " + color);
    }
}
