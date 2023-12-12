package org.example;

public class Purchase {
    /**
     * Класс, получения информации о покупке
     *
     * Поля:
     * itemsCount : int - количество товаров
     * totalAmount : double - общая сумма товаров
     * discount : double - скидка на товар
     */

    private int itemsCount; // Поле для хранения количества товаров
    private double totalAmount; // Поле для хранения общей суммы товаров
    private double discount; // Поле для хранения скидки на товар

    public Purchase(int itemsCount, double totalAmount, double discount) {
        // Конструктор класса, принимает и инициализирует значения для полей
        this.itemsCount = itemsCount;
        this.totalAmount = totalAmount;
        this.discount = discount;
    }

    public void calculateTotal() {
        /**
         * Метод для расчета общей суммы покупки без скидки и с учетом скидки
         * Выводит обе суммы на экран
         */
        double totalWithoutDiscount = itemsCount * totalAmount; // Расчет общей суммы без скидки
        double totalWithDiscount = totalWithoutDiscount * (1 - discount / 100); // Расчет общей суммы с учетом скидки

        System.out.printf("Общая сумма покупки без скидки: %.2f\n", totalWithoutDiscount); // Вывод общей суммы без скидки
        System.out.printf("Общая сумма покупки со скидкой: %.2f\n", totalWithDiscount); // Вывод общей суммы с учетом скидки
    }
}

