package ua.anikin.hw2;

public class Task2 {
    public static void main(String[] args) {

        task2(1, 5, 2, 10, 3, -5);
    }

    public static void task2(double x1, double y1, double x2, double y2, double x3, double y3) {
        double S = Math.abs((x1 * y2 + x2 * y3 + x3 * y1 - x2 * y1 - x3 * y2 - x1 * y3) / 2);
        System.out.print(S);
    }
}
