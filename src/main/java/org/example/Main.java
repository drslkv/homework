package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService animalService = new CreateAnimalServiceImpl();

        // Создание 10 уникальных животных
        animalService.createTenAnimals();

        // Создание N животных (в данном случае 5)
        animalService.createNAnimals(5);
    }
}
