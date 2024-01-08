package src.JavaBase;

public class Yields {

    public static void main(String[] args) {


        String code = "AMMA";

        int value = switch (code) {

            case "SARATH" -> {

                yield 99;
            }

            case "AMMU" -> {

                yield 11;
            }

            default -> {
                System.out.println("999");

                yield 0;
            }

        };

        System.out.println(value);
    }
}