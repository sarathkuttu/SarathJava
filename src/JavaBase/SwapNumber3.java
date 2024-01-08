package src.JavaBase;

import java.util.Scanner;

public class SwapNumber3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE VALUE OF A");

        int a = sc.nextInt();

        System.out.println("ENTER THE VALUE OF B");

        int b = sc.nextInt();

        a = a * b;

        b = a / b;

        a = a / b;

        System.out.printf("%d is the value of a", a);

        System.out.println();
        System.out.printf("%d is the value of b", b);
    }
}
