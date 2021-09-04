package ua.anikin.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        fillingTheArray(array);
        System.out.println("Array-> " + Arrays.toString(array));
        System.out.print("Enter delete element -> ");
        System.out.println("Decreased array -> " + Arrays.toString(decreasingArray(array, in.nextInt())));

    }


    public static int[] fillingTheArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 1;
        }
        return mas;
    }

    public static int[] decreasingArray(int[] mas, int index) {
        int[] ReducedArray = Arrays.copyOf(mas, mas.length - 1);
        for (int i = 0; i < ReducedArray.length; i++) {
            if (index >= 0 && index <= mas.length - 1) {
                System.arraycopy(mas, index + 1, ReducedArray, index, ReducedArray.length - index);
            } else {
                return null;
            }
        }
        return ReducedArray;
    }
}
