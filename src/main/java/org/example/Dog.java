package org.example;

import java.math.BigDecimal;

class Dog extends Pet {
    public Dog(String breed, BigDecimal cost, String character) {
        super(breed, cost, character);
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public BigDecimal getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }
}
