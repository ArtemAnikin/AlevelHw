package ua.anikin.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double secret = 20+ Math.random()*20;
        //System.out.println("Secret -> " + (int)secret);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter guess from 20 to 40 -> ");
        int guess = in.nextInt();
        while(guess != (int)secret)
        {
            if(guess<secret)
                System.out.println("Мало");
            else
                System.out.println("Много");
            System.out.print("Try again -> ");
            guess = in.nextInt();
        }
        System.out.print("You win!!! Secret -> " + (int)secret);
        in.close();

    }
}
