package src.Javanotes;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char l = sc.next().toCharArray()[0];


        switch (l) {

            case 'a':

                System.out.println("It's a VOWEL");

                break;

            default:

                System.out.println("Not a vowel");


        }


    }
}
