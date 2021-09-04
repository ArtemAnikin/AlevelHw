package ua.anikin.hw9.Task1;

public class Main {
    public static void main(String[] args) {
        CreatePlanet[] planets = {new Earth(), new Jupiter(), new Pluto(), new Uranus(), new Venus()};

        for (CreatePlanet info : planets) {
            System.out.printf("Название планеы = %s, Ускорение свободного падения = %f (м/с)2, Наличие жизни = %b", info.name, info.checkAccelerationOfGravity(), info.checkExistenceOfLife());
            System.out.print(System.lineSeparator());
        }
    }
}
