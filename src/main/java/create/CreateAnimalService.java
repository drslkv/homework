package create;

import animals.Cat;
import animals.Dog;
import animals.Shark;
import animals.Wolf;
import typeOfAnimal.AbstractAnimal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

interface CreateAnimalService {
    default void createAnimals() {
        Set<String> uniqueAnimals = new HashSet<>();
        Random random = new Random();

        String[] names = {"Buddy", "Max", "Charlie", "Bella", "Lucy", "Daisy", "Rocky", "Luna"};
        int randomIndex = random.nextInt(names.length);

        String[] character = {"Aggressive", "Fierce", "Friendly", "Playful"};
        int randomIndexCharacter= random.nextInt(character.length);

        LocalDate birthDate = randBirthDate();

        while (uniqueAnimals.size() < 10) {
            int randomAnimalType = random.nextInt(4);
            AbstractAnimal animal = null;

            switch (randomAnimalType) {
                case 0:
                    animal = new Wolf("Wolf" + uniqueAnimals.size(), names[randomIndex],
                            BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                            birthDate);
                    break;
                case 1:
                    animal = new Shark("Shark" + uniqueAnimals.size(), names[randomIndex],
                            BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                            birthDate);
                    break;
                case 2:
                    animal = new Dog("Dog" + uniqueAnimals.size(), names[randomIndex],
                            BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                            birthDate);
                    break;
                case 3:
                    animal = new Cat("Cat" + uniqueAnimals.size(), names[randomIndex],
                            BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                            birthDate);
                    break;
            }

            uniqueAnimals.add(animal.getBreed());
            System.out.println("Created: " + animal.getBreed() + " " + animal.getName() + " " + animal.getCharacter()
                    + " " + animal.getCost() + " " + animal.getBirthDate());
        }
    }

    LocalDate randBirthDate();

    void createAnimals(int n);
}
