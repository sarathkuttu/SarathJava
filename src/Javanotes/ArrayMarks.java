package src.Javanotes;

import java.util.Scanner;

public class ArrayMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];

        System.out.println("Enter marks of English");

        marks[0] = sc.nextFloat();

        System.out.println("Enter marks of Hindi");

        marks[1] = sc.nextFloat();

        System.out.println("Enter marks of Maths");

        marks[2] = sc.nextFloat();

        System.out.println("Enter marks of Science");

        marks[3] = sc.nextFloat();

        System.out.println("Enter marks of IT");

        marks[4] = sc.nextFloat();

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] <= 30)

                System.out.println("Failed" + marks[i]);

            else
                System.out.println("Passed" + marks[i]);


        }
    }
}
