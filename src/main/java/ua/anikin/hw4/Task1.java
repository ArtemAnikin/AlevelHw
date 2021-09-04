package ua.anikin.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] Array = new int[400];
        fillingTheArray(Array);
        int[] CopyArray = Arrays.copyOf(Array, Array.length);
        print(CopyArray);
        System.out.println("Average = " + average(CopyArray));
        System.out.println("GeometricMean = " + geometricMean(CopyArray));

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

    public static float average(int[] Array) {
        float sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum += Array[i];
        }
        return sum / Array.length;
    }

    public static double geometricMean(int[] Array) {
        double sum = 1;
        for (int i = 0; i < Array.length; i++) {
            sum *= Array[i];
        }
        return Math.pow(sum, 1.0/Array.length);
    }
}


