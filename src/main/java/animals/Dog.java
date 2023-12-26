package animals;

import typeOfAnimal.Pet;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Dog extends Pet {
    public Dog(String breed, String name, BigDecimal cost, String character, LocalDate birthDate) {
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
        return "Dog: " + getBreed() + ", birthDate: " + getBirthDate();
    }
}
