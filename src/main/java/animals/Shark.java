package animals;

import typeOfAnimal.Predator;
import java.math.BigDecimal;

public class Shark extends Predator {
    public Shark(String breed, String name, BigDecimal cost, String character) {
        super(breed, name, cost, character);
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
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
