package ua.anikin.hw4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] Array = new int[20];
        fillingTheArray(Array);
        int[] CopyArray = Arrays.copyOf(Array, Array.length);
        print(CopyArray);
        change(CopyArray);
        print(CopyArray);
    }

    public static int[] fillingTheArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (1 + Math.random() * 10);
        }
        return Array;
    }

    public static void print(int[] Array) {
        System.out.println(Arrays.toString(Array));
    }

    public static int[] change(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == 0) {
                Array[i] = 0;
            }
        }
        return Array;
    }


}
