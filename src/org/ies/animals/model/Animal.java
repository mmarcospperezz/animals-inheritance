package org.ies.animals.model;

import java.util.Objects;

public abstract class Animal {
        protected int edad;

        public Animal(int edad) {
            this.edad = edad;
        }

    public abstract void talk();

    public abstract void showInfo();

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return edad == animal.edad;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(edad);
    }
}


