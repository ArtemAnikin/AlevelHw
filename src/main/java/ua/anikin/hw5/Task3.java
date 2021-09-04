package ua.anikin.hw5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        fillingTheArray(array);
        //System.out.println(Arrays.deepToString(Array)); //Визуально не читабельный массив
        printArray(array);
        System.out.println("");
        printArray(changeRowsToColumns(array));
    }

    public static void printArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static int[][] fillingTheArray(int[][] mas) {
        int index = 1;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = index++;
            }
        }
        return mas;
    }

    public static int[][] changeRowsToColumns(int[][] mas) {
        int[][] NewMass = new int[mas[0].length][mas.length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                NewMass[i][j] = mas[j][i];
            }
        }
        return NewMass;
    }
}
