package JavaBase;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value a");

        int a = sc.nextInt();

        System.out.println("Enter the value b");

        int b = sc.nextInt();

        int temp = a;

        a = b;

        b = temp;

        System.out.printf("%d is the value of a" ,a);

        System.out.println();

        System.out.printf("%d is the value of b",b);
    }
}
