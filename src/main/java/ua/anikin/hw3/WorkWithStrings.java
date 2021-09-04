package ua.anikin.hw3;

// str.getChars(start, end, mas,0)
// str.equals()
// str.equalsIgnoreCase()
// str.lastIndexOf()
// String.join(" ", str, str)
// str.replace(" "," ")
// str.toLowerCase() / str. toUpperCase()
public class WorkWithStrings {
    public static void main(String[] args) {
        String str = "ч";
        String str2 = "и";
        String rez;
        String str3 = "В отличие от сравнения числовых и других данных примитивных типов для строк не применяется знак равенства ==. Вместо него надо использовать метод equals().";

        int start = 1;
        int end = 2;
        char[] dst = new char[end - start];
        str3.getChars(start, end, dst, 0);
        System.out.println(str3.lastIndexOf(str2)); // world

    }


    public static String concatenation(String str1, String str2) {
        return String.join(" ", str1, str2);
    }
}
