package org.ies.animals;

import java.util.Objects;

public class Dog extends Animal {
    private String raza;

    public Dog(int edad, String raza) {
        super(edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(raza, dog.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(raza);
    }

    @Override
    public String
    toString() {
        return "Dog{" +
                "raza='" + raza + '\'' +
                '}';
    }

    @Override
    public void talk() {
        System.out.println("guau, guau");
    }

    @Override
    public void showInfo() {
        System.out.println("Perro:");
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Raza: " + raza);
    }
}
