package ua.anikin.hw6;

public class Task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("380984618215", "Samsung", 14);
        Phone phone2 = new Phone("384157451859", "Xiaomi");
        Phone phone3 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Artem" + " ");
        System.out.print(System.lineSeparator());
        phone2.receiveCall("Boris" + " ");
        System.out.print(System.lineSeparator());
        phone3.receiveCall("Anton" + " ");
        System.out.print(System.lineSeparator());

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());


    }

}
