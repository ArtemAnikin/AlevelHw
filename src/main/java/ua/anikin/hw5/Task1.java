package ua.anikin.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[4][3];
        fillingTheArray(array);
        System.out.println("Array: " + Arrays.deepToString(array));
    }


    public static int[][] fillingTheArray(int[][] mas) {
        int index = 1;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i % 2 == 0)
                    mas[i][j] = index++;
                else
                    mas[i][j] = index++ * -1;
            }
        }
        return mas;
    }
}
