package org.example;

import java.math.BigDecimal;
import java.util.Random;

abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected BigDecimal cost;
    protected String character;

    public AbstractAnimal(String breed, BigDecimal cost, String character) {
        this.breed = breed;
        this.cost = cost.setScale(2, BigDecimal.ROUND_HALF_UP);
        this.character = character;
        // Generating a default name based on breed and a random number
        this.name = breed + "_" + (new Random().nextInt(1000));
    }
}

