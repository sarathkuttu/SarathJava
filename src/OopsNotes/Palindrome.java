package src.OopsNotes;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");

        String word = sc.next();

        Boolean p = isPalindrome(word);

        if (p) {

            System.out.println("It's a palindrome");
        } else {

            System.out.println("Not a palindrome");
        }


    }

    private static Boolean isPalindrome(String word) {

        StringBuilder sb = new StringBuilder(word);

        sb.reverse();

        return word.equalsIgnoreCase(sb.toString());
    }
}
