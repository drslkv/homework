package search;

import create.Animal;

public interface SearchService {
    String[] findLeapYearNames(Animal[] animals);
    Animal[] findOlderAnimal(Animal[] animals, int age);
    void findDuplicates(Animal[] animals);
}
