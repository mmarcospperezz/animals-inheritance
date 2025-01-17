package org.ies.animals;

import java.util.Objects;

public class Pig extends Animal {
    private String alimentacion;

    public Pig(int edad, String alimentacion) {
        super(edad);
        this.alimentacion = alimentacion;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pig pig = (Pig) o;
        return Objects.equals(alimentacion, pig.alimentacion);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(alimentacion);
    }

    @Override
    public String toString() {
        return "Pig{" +
                "alimentacion='" + alimentacion + '\'' +
                '}';
    }

    @Override
    public void talk() {
        System.out.println("oink, oink");
    }

    @Override
    public void showInfo() {
        System.out.println("Cerdo:");
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Alimentación: " + alimentacion);
    }
}
