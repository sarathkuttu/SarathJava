package src.Javanotes;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side1, side 2 and side 3");

        int Side1 = sc.nextInt();
        int Side2 = sc.nextInt();
        int Side3 = sc.nextInt();


        if ((Side1 == Side2) && (Side1 == Side3) && (Side3 == Side2)) {

            System.out.println("EQ");
        }

        else if ((Side1 == Side2) || (Side1 == Side3) || (Side3 == Side2)) {

            System.out.println("ISO");
        } else {

            System.out.println("SCALENE");
        }
    }

}
