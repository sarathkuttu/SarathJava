package src.Javanotes;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number to check if it's prime: ");
        int number = sc.nextInt();

        // Check if the number is prime


        boolean isPrime = checkPrime(number);

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        sc.close();
    }

    // Function to check if a number is prime
    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Loop to check for divisibility by numbers less than 'num'
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible, it's not a prime number
            }
        }

        return true; // If no divisors found, it's a prime number
    }
}



