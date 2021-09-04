package ua.anikin.Test;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите начальную точку и точку для перемещения, через \'-\' , пример a1-c3 или exit для выхода ->");
        String currentPosition, nextStep;
        String step = in.next();
        while (!"exit".equals(step)) {
            currentPosition = step.split("-")[0].toLowerCase();
            nextStep = step.split("-")[1].toLowerCase();
            if (isRightStep(currentPosition.charAt(0), Character.digit(currentPosition.charAt(1), 10),
                    nextStep.charAt(0), Character.digit(nextStep.charAt(1), 10))) {
                System.out.println("Можно так ходить!");
            } else System.out.println("Так ходить нельзя!");
            System.out.println("Введите точку для перемещения или \'exit\'");
            step = in.next();
        }
        in.close();
    }


    public static boolean fieldExitCheck(char letter, int num) {
        return ((letter >= 'a' && letter <= 'h') && (num >= 1 && num <= 8));
    }

    public static boolean isRightStep(char currentLetter, int currentNum, char nextLetter, int nextNum) {
        return (fieldExitCheck(currentLetter, currentNum) &&
                fieldExitCheck(nextLetter, nextNum) &&
                Math.abs(currentLetter - nextLetter) + Math.abs(currentNum - nextNum) == 3 &&
                Math.abs(currentLetter - nextLetter) < 3 && Math.abs(currentNum - nextNum) < 3);
    }
}
