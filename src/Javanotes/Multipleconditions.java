package src.Javanotes;

import java.util.Scanner;

public class Multipleconditions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 50) {

            System.out.println("Greater than 50");
        } else if (number > 20) {

            System.out.println("Greater than 20");

        } else {

            System.out.println("Less than 20");

        }
    }

}


