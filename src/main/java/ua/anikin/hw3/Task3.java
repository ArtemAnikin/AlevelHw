package ua.anikin.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write a line -> ");
        String str = in.nextLine();
        System.out.println("Number of words in line -> " + wordCount(str));
        //System.out.print(str.length() - str.replace(" ", "").length()+1);
        in.close();

    }

    public static int wordCount(String str) {
        int cout = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                cout++;
            }
        }
        return cout;
    }
}
