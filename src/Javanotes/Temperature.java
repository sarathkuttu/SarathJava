package src.Javanotes;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner celsius = new Scanner(System.in);

        System.out.println("Enter the degree in Celsius");

        double input = celsius.nextDouble();

        double far = (input * 1.8) + 32;

        System.out.println(far + "Fahrenheit");

        Scanner fah = new Scanner(System.in);

        System.out.println("Enter the degree in Fahrenheit");

        double inp = fah.nextDouble();

        double cel = (inp - 32) * 5 / 9;

        System.out.println(cel + "Celsius");


    }


}
