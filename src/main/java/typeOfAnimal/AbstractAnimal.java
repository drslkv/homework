package typeOfAnimal;

import create.Animal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected BigDecimal cost;
    protected String character;

    public AbstractAnimal(String breed, String name, BigDecimal cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost.setScale(2, RoundingMode.HALF_UP);
        this.character = character;
    }
}

