package create;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService animalService = new CreateAnimalServiceImpl();

        // Создание 10 уникальных животных
        animalService.createAnimals();

        System.out.println(" ");
        // Создание N животных (в данном случае 5)
        animalService.createAnimals(5);
    }
}
