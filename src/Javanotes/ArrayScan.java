package src.Javanotes;

import java.util.Scanner;

public class ArrayScan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE LENGTH OF ARRAY");

        int array_length = sc.nextInt();

        int[] array = new int[array_length];

        System.out.println("ENTER THE ELEMENTS OF ARRAY");

        for (int i = 0; i < array_length; i++) {

            array[i] = sc.nextInt();
        }

        System.out.println("DONE");

        for (int i = 0; i < array_length; i++) {

            System.out.println(array[i]);
        }

        sc.close();

    }
}


