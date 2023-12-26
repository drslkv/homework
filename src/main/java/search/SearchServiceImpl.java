package search;

import create.Animal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchServiceImpl implements SearchService {
    @Override
    public String[] findLeapYearNames(Animal[] animals) {
        return Arrays.stream(animals)
                .filter(animal -> animal.getBirthDate().isLeapYear())
                .map(Animal::getBreed)
                .toArray(String[]::new);
    }

    @Override
    public Animal[] findOlderAnimal(Animal[] animals, int age) {
        LocalDate referenceDate = LocalDate.now().minusYears(age);
        return Arrays.stream(animals)
                .filter(animal -> animal.getBirthDate().isBefore(referenceDate))
                .toArray(Animal[]::new);
    }

    @Override
    public void findDuplicates(Animal[] animals) {
        List<Animal> animalList = Arrays.asList(animals);
        List<Animal> duplicates = animalList.stream()
                .filter(animal -> animalList.indexOf(animal) != animalList.lastIndexOf(animal))
                .collect(Collectors.toList());

        if (!duplicates.isEmpty()) {
            System.out.println("Duplicates found:");
            for (Animal animal : duplicates) {
                System.out.println(animal.getBreed());
            }
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
