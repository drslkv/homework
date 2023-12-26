package animals;

import typeOfAnimal.Predator;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Shark extends Predator {
    public Shark(String breed, String name, BigDecimal cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
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

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Shark: " + getBreed() + ", birthDate: " + getBirthDate();
    }
}
