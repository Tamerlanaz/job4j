package ru.job4j.array;

public class Check {
    /**
     *
     * @param data
     * @return result
     * метод возвращает false и прерывает цикл for если значение в ячейке массива не равно значению в следующей ячейке
     */

    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index =0; index < data.length-1; index++) {
            if (data [index]= data [++index]) {
                result = true;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }
}

