package create;

import animals.Cat;
import animals.Dog;
import animals.Shark;
import animals.Wolf;
import typeOfAnimal.AbstractAnimal;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

interface CreateAnimalService {
    default void createAnimals() {
        Set<String> uniqueAnimals = new HashSet<>();
        Random random = new Random();

        String[] names = {"Buddy", "Max", "Charlie", "Bella", "Lucy", "Daisy", "Rocky", "Luna"};
        int randomIndex = random.nextInt(names.length);

        while (uniqueAnimals.size() < 10) {
            int randomAnimalType = random.nextInt(4); // Здесь 4 - количество возможных типов животных
            AbstractAnimal animal = null;

            switch (randomAnimalType) {
                case 0:
                    animal = new Wolf("Wolf" + uniqueAnimals.size(), names[randomIndex], BigDecimal.valueOf(random.nextDouble() * 100), "Aggressive");
                    break;
                case 1:
                    animal = new Shark("Shark" + uniqueAnimals.size(), names[randomIndex], BigDecimal.valueOf(random.nextDouble() * 100), "Fierce");
                    break;
                case 2:
                    animal = new Dog("Dog" + uniqueAnimals.size(), names[randomIndex], BigDecimal.valueOf(random.nextDouble() * 100), "Friendly");
                    break;
                case 3:
                    animal = new Cat("Cat" + uniqueAnimals.size(), names[randomIndex], BigDecimal.valueOf(random.nextDouble() * 100), "Playful");
                    break;
            }

            uniqueAnimals.add(animal.getBreed());
            System.out.println("Created: " + animal.getBreed());
        }
    }

    void createAnimals(int n);
}
