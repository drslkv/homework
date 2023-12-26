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
import java.util.concurrent.ThreadLocalRandom;

class CreateAnimalServiceImpl implements CreateAnimalService {
    public LocalDate randBirthDate() {
        LocalDate startDate = LocalDate.of(2018, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);

        long startEpochDay = startDate.toEpochDay();
        long endEpochDay = endDate.toEpochDay();
        long randomEpochDay = ThreadLocalRandom.current().nextLong(startEpochDay, endEpochDay);

        return LocalDate.ofEpochDay(randomEpochDay);
    }
    public void createAnimals(int n) {
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int randomAnimalType = random.nextInt(4);
            AbstractAnimal animal = null;

            String[] names = {"Buddy", "Max", "Charlie", "Bella", "Lucy", "Daisy", "Rocky", "Luna"};
            int randomIndex = random.nextInt(names.length);

            String[] character = {"Aggressive", "Fierce", "Friendly", "Playful"};
            int randomIndexCharacter= random.nextInt(character.length);

            LocalDate birthDate = randBirthDate();

            switch (randomAnimalType) {
                case 0:
                    animal = new Wolf("Wolf_" + i, names[randomIndex],
                            BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                            birthDate);
                    break;
                case 1:
                    animal = new Shark("Shark_" + i, names[randomIndex],
                            BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                            birthDate);
                    break;
                case 2:
                    animal = new Dog("Dog_" + i, names[randomIndex],
                            BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                            birthDate);
                    break;
                case 3:
                    animal = new Cat("Cat_" + i, names[randomIndex],
                            BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                            birthDate);
                    break;
            }


            System.out.println("Created: " + animal.getBreed() + " " + animal.getName() + " " + animal.getCharacter()
                    + " " + animal.getCost() + " " + animal.getBirthDate());
        }
    }

    public void createAnimals() {
        Set<String> uniqueAnimals = new HashSet<>();
        Random random = new Random();

        do {
            int randomAnimalType = random.nextInt(4); // Здесь 4 - количество возможных типов животных
            AbstractAnimal animal = null;

            String[] names = {"Buddy", "Max", "Charlie", "Bella", "Lucy", "Daisy", "Rocky", "Luna"};
            int randomIndex = random.nextInt(names.length);

            String[] character = {"Aggressive", "Fierce", "Friendly", "Playful"};
            int randomIndexCharacter= random.nextInt(character.length);

            LocalDate birthDate = randBirthDate();

            switch (randomAnimalType) {
                case 0:
                    animal = new Wolf("Wolf_" + uniqueAnimals.size(), names[randomIndex],
                            BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                            birthDate);
                    break;
                case 1:
                    animal = new Shark("Shark_" + uniqueAnimals.size(), names[randomIndex],
                            BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                            birthDate);
                    break;
                case 2:
                    animal = new Dog("Dog_" + uniqueAnimals.size(), names[randomIndex],
                            BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                            birthDate);
                    break;
                case 3:
                    animal = new Cat("Cat_" + uniqueAnimals.size(), names[randomIndex],
                            BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                            birthDate);
                    break;
            }


            uniqueAnimals.add(animal.getBreed());
            System.out.println("Created: " + animal.getBreed() + " " + animal.getName() + " " + animal.getCharacter()
                    + " " + animal.getCost() + " " + animal.getBirthDate());

        } while (uniqueAnimals.size() < 10);
    }
}