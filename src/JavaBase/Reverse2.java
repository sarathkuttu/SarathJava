package src.JavaBase;

public class Reverse2 {

    public static void main(String[] args) {

        String name = "NAINIKA";

        String n = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            n = n + name.charAt(i);


        }
        System.out.println(n);

    }
}
