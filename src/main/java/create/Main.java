package create;

import search.SearchService;
import search.SearchServiceImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService animalService = new CreateAnimalServiceImpl();

        animalService.createAnimals();

        System.out.println(" ");
        animalService.createAnimals(5);


        CreateService createService = new AnimalFactory();
        Animal[] generatedAnimals = createService.generateAnimals(15);

        SearchService searchService = new SearchServiceImpl();

        System.out.println(" ");
        String[] leapYearNames = searchService.findLeapYearNames(generatedAnimals);
        System.out.println("Animals born in leap years: " + Arrays.toString(leapYearNames));

        Animal[] olderAnimals = searchService.findOlderAnimal(generatedAnimals, 5);
        System.out.println("Animals older than 5 years: ");
        for (Animal animal : olderAnimals) {
            System.out.println(animal);
        }

        searchService.findDuplicates(generatedAnimals);
    }
}
