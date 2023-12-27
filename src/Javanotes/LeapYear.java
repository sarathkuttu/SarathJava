package src.Javanotes;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        if ((number % 4 == 0 && number % 100 != 0 || number % 400 == 0)) {

            System.out.println("LEAP YEAR");

        }else {

            System.out.println("NOT A LEAP YEAR");
        }

    }
}
