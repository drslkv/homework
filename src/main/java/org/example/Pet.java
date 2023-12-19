package org.example;

import java.math.BigDecimal;

abstract class Pet extends AbstractAnimal {
    public Pet(String breed, BigDecimal cost, String character) {
        super(breed, cost, character);
    }
}