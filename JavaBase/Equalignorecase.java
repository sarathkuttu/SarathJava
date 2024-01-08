package JavaBase;

public class Equalignorecase {

    public static void main(String[] args) {

        String Actual = "Sarath";

        String expected = "sarath";

        if (Actual.equalsIgnoreCase(expected)) {

            System.out.println("Matching");

        } else {

            System.out.println("Not matching");

        }
    }
}
