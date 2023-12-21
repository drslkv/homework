package org.example;

import java.math.BigDecimal;

interface Animal {
    /**
     * Получить породу животного
     *
     * @return строка с названием породы
     */
    String getBreed();

    /**
     * Получить цену животного
     *
     * @return цена животного
     */
    BigDecimal getCost();

    /**
     * Получить характер животного
     *
     * @return строка с описанием характера
     */
    String getCharacter();
}
