package org.example;

import java.math.BigDecimal;

abstract class Predator extends AbstractAnimal {
    public Predator(String breed, BigDecimal cost, String character) {
        super(breed, cost, character);
    }
}
