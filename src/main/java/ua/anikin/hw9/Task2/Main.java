package ua.anikin.hw9.Task2;

public class Main {
    public static void main(String[] args) {

        Pow toPow = (number, pow) -> {
            int result = 1;
            for (int i = 0; i < pow; i++) {
                result *= number;
            }
            return number;
        };

        System.out.println(toPow.pow(5, 4));
    }
}
