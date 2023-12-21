package create;

import java.math.BigDecimal;

public interface Animal {
    /**
     * Получить породу животного
     *
     * @return строка с названием породы
     */
    String getBreed();

    /**
     * Получить имя животного
     *
     * @return имя животного
     */
    String getName();

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
