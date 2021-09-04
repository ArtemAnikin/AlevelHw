package ua.anikin.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write a line -> ");
        String str = in.nextLine();
        str = delSpaces(str);
        System.out.println("Line without spaces -> " + str);
        System.out.println("Flip line -> " + lineFlip(str));
        System.out.println("Compare -> " + compare(str, lineFlip(str)));
        in.close();
        

    }

    public static String delSpaces(String str) {
        return str.replaceAll("\\s", "");

    }

    public static String lineFlip(String str) {
        char[] arr = str.toCharArray();
        String rezult = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            rezult += arr[i];
        }
        return rezult;
    }

    public static boolean compare(String str, String flipStr) {
        if (str.equalsIgnoreCase(flipStr))
            return true;
        else
            return false;
    }
}