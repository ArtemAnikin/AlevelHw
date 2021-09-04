package ua.anikin.hw5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {6, 5, 4, 3, 2, 1};
        int[] array2 = {6, 5, 3, 4, 2, 1};
        System.out.println(Arrays.toString(array1));
        System.out.println(isOrderedArray(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(isOrderedArray(array2));
    }

    public static boolean isOrderedArray(int[] mas) {
        boolean isOrderCheck = false;
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] >= mas[i + 1]) {
                isOrderCheck = true;
            } else {
                return false;
            }
        }
        return isOrderCheck;
    }
}
