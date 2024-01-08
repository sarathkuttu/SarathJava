package JavaBase;

import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER 2 NUMBERS");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {

            System.out.println("MAX" + a);
        }
        else

            System.out.println("MAX" + b);
        }
    }


