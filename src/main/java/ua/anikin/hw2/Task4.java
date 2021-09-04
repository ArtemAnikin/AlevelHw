package ua.anikin.hw2;

public class Task4 {
    public static void main(String[] args) {
        task4(5, 0, -5);
    }

    public static void task4(int a, int b, int c) {
        int mas[] = {a, b, c};
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            System.out.print(
                    mas[i] < 0 ? (mas[i] *= (-1)) + " " : mas[i] + " "
            );
            if (min > mas[i])
                min = mas[i];
        }
        System.out.println("min number -> " + min);
    }
}
