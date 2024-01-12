package src.OopsNotes;

import java.util.Scanner;

public class Person2Child {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st name");

        String name1 = sc.next();

        Person2 p = new Person2(name1);

        p.Print();


        System.out.println("Enter the 2nd name");

        String name2 = sc.next();

        Person2 p2 = new Person2(name2);

        p2.Print();
    }
}
