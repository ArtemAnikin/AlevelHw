package ua.anikin.hw7;

public class Task3 {
    public static void main(String[] args) {
        Vector[] vector = Vector.vectorArray(10);
        System.out.println("Vector1 -> " + vector[0]);
        System.out.print(System.lineSeparator());
        System.out.println("Vector2 -> " + vector[1]);
        System.out.print(System.lineSeparator());
        System.out.println("Length Vector1 -> " + vector[0].vectorLength());
        System.out.print(System.lineSeparator());
        System.out.println("Vector product -> " + vector[0].vectorProduct((vector[1])));
        System.out.print(System.lineSeparator());
        System.out.println("Vectors cos -> " + vector[0].vectorCos(vector[1]));
        System.out.print(System.lineSeparator());
        System.out.println("Vectors sum -> " + vector[0].vectorSum(vector[1]));
        System.out.print(System.lineSeparator());
        System.out.println("Vectors subtract -> " + vector[0].vectorSubtract(vector[1]));
    }
}
