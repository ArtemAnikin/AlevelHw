package ua.anikin.hw9.Task1;

public class CreatePlanet implements Planet {
    public String name;
    public double accelerationOfGravity;
    public boolean existenceOfLife;


    @Override
    public double checkAccelerationOfGravity() {
        return accelerationOfGravity;
    }

    public boolean checkExistenceOfLife() {
        return existenceOfLife;
    }
}
