package src.Javanotes;

import java.util.Scanner;

public class Conditions2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        //int a = 50;

        if (a % 2 == 1) {

            System.out.println("ODD");

        } else {

            System.out.println("EVEN");
        }
    }
}