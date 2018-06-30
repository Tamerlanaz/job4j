package ru.job4j.array;

public class Turn {
    public int[] turn(int[] array) { // объявляем массив
        for (int index = 0; index < array.length / 2; index++) { // цикл for по ячейке массива, от 0 ло половины массива (иначе все вернется назад), шаг 1
            int i = array[index]; // вводим переменную i и передаем ей значение из ячейки массива
            array[index] = array[array.length - 1 - index]; //передаем нашей ячейке значение "зеркальной" ячейки с конца массива
            array[array.length - 1 - index] = i;  // передаем "зеркальной" ячейке значение переменной i.
        }
        return array;
    }
}