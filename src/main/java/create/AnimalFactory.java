package create;

import animals.Cat;
import animals.Dog;
import animals.Shark;
import animals.Wolf;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class AnimalFactory implements CreateService {
    @Override
    public Animal[] generateAnimals(int numberOfAnimals) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < numberOfAnimals; i++) {

            CreateAnimalServiceImpl animalService = new CreateAnimalServiceImpl();
            LocalDate birthDate = animalService.randBirthDate();
            Random random = new Random();

            String[] names = {"Buddy", "Max", "Charlie", "Bella", "Lucy", "Daisy", "Rocky", "Luna"};
            int randomIndex = random.nextInt(names.length);

            String[] character = {"Aggressive", "Fierce", "Friendly", "Playful"};
            int randomIndexCharacter= random.nextInt(character.length);

            animals.add(new Wolf("Wolf_" + i, names[randomIndex],
                    BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                    birthDate));

            animals.add(new Shark("Shark_" + i, names[randomIndex],
                    BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                    birthDate));

            animals.add(new Dog("Dog_" + i, names[randomIndex],
                    BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                    birthDate));

            animals.add(new Cat("Cat_" + i, names[randomIndex],
                    BigDecimal.valueOf(random.nextDouble() * 100), character[randomIndexCharacter],
                    birthDate));
        }
        return animals.toArray(new Animal[0]);
    }
}
