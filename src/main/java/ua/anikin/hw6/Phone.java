package ua.anikin.hw6;

public class Phone {
    String number;
    String model;
    double weight;

    Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(String number,String model){
        this.number = number;
        this.model = model;
    }

    Phone(){
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    void receiveCall (String name){
        System.out.printf("Звонит %s",name);
    }

    String getNumber(){
        return number;
    }

}
