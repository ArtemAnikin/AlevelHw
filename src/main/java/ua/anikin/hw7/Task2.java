package ua.anikin.hw7;

public class Task2 {
    public static void main(String[] args) {
        Student student = new Student("Denis", "Ivanov", "Group1", 4.9);
        Aspirant aspirant1 = new Aspirant("Anton", "Ivanov", "Group2", 5, "scientificWork1");
        Student aspirant2 = new Aspirant("Andrey", "Ivanov", "Group3", 4, "scientificWork2");
        Student[] students = {student, aspirant1, aspirant2};
        for (Student count: students){
            System.out.println(count.getScholarship());
        }
    }
}
