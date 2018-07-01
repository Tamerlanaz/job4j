package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            //for (int j = 0; j < data.length - 1; j++) {
                //if (i == j) {
            if (data[data.length - 1 - i][i] != data[i][i]) {
                result = false;
                break;
            }
            if (data[i][i] != data[i + 1][i + 1]) {
                result = false;
                break;
            }
                //}
                //if (i == data.length + 1 - j) {
            if (data[data.length - 1 - i][i] != data[data.length - 2 - i][i + 1]) {
                result = false;
                break;
            }
                //}
            //}
            //}
        }
//        for () {
//        }
        return result;
    }
}