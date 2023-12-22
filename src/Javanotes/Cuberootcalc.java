package src.Javanotes;

import java.util.Scanner;

public class Cuberootcalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input values for x, y, and z
        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();


        System.out.print("Enter the value of y: ");
        double y = sc.nextDouble();

        System.out.print("Enter the value of z: ");
        double z = sc.nextDouble();

        // Calculate the cube root of (x^2 + y^2 - |z|)


        double result = Math.cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));

        // Print the result
        System.out.println("Cube root of (x^2 + y^2 - |z|) is: " + result);

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}

