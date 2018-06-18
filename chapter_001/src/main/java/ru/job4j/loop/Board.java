package ru.job4j.loop;

/**
 * @author Timur Hamidullin (mailto:tamerlanaz@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Board {

    /**
     * Программа рисует шахматку из X и пробелов.
     * @param height высота шахматки.
     * @param width ширина шахматки.
     * @return шахматка.
     */

    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++ ) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((i+j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}

