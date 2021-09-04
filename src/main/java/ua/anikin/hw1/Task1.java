package ua.anikin.hw1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
            // ganges
            String name = "Artem", Sername = "Anikin";

            LocalDateTime DateTime = LocalDateTime.now();
            DateTimeFormatter FormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String FormattedDateTime  = DateTime.format(FormatObj);

            System.out.println("Name = " + name + "\nSername = " + Sername + "\nDate and time = " + FormattedDateTime );

            Scanner in = new Scanner(System.in);
            System.out.println("Input a number String Method");
            String num = in.nextLine();
            char[]arr = num.toCharArray();

            for(int i = arr.length-1; i>=0; i--)
            {
                System.out.printf("%s", arr[i]);
            }


            System.out.println("\nInput a number Int Method");
            int num1 = in.nextInt();

            while(num1 > 0)
            {
                System.out.print(num1%10);
                num1 /= 10;
            }

            in.close();

        }
    }

