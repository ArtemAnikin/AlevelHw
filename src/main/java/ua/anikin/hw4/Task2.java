package ua.anikin.hw4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] Array = new int[1000];
        fillingTheArray(Array);
        int[] CopyArray = Arrays.copyOf(Array, Array.length);
        print(CopyArray);
        System.out.println("Prime numbers = " + primeNumber(CopyArray));
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

    public static int primeNumber(int[] Array) {
        int count = 0;
        int number = 2;
        int rez = 0;
        for (int i = 0; i < Array.length; i++) {
            while (number <= Array[i]) {
                if (Array[i] % number == 0) {
                    count++;
                }

                number++;
            }
            if (count == 1) {
                rez++;
            }
            number = 2;
            count = 0;
        }
        return rez;
    }

}

