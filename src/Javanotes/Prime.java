package src.Javanotes;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        int i = 0;

        int temp = 0;

        int a = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER A NUMBER");

        int n = sc.nextInt();

        a = n / 2;

        if (n == 0 || n == 1) {

            System.out.printf("%s Not a prime number", n);

        } else {

            for (i = 2; i < a; i++) {

                if (n % i == 0) {

                    System.out.printf("%s Not a prime number", n);

                    temp = 1;

                    break;
                }

            }
        }

        if (temp == 0) {

            System.out.printf("%s is a prime number", n);
        }
    }
}
