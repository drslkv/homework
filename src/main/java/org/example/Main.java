package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание объектов Purchase с разными параметрами
        Purchase purchase1 = new Purchase(10, 650.0, 0.75);
        Purchase purchase2 = new Purchase(20, 1100.0, 42.575);
        Purchase purchase3 = new Purchase(5, 2500.0, 58.1);

        // Вызов метода для расчета и вывода общей суммы с и без скидки для каждого объекта
        System.out.println("Покупка 1:");
        purchase1.calculateTotal();
        System.out.println("-----------");
        System.out.println("Покупка 2:");
        purchase2.calculateTotal();
        System.out.println("-----------");
        System.out.println("Покупка 3:");
        purchase3.calculateTotal();
    }
}