package ua.anikin.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number ->");
        int num = in.nextInt();
        task3(num);
        in.close();
    }

    public static void task3(int a) {
        System.out.println(
                a % 2 == 0 ? "Чётное" : "Не чётное"
        );
    }
}
