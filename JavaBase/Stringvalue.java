package JavaBase;

import java.util.Locale;

public class Stringvalue {

    public static void main(String[] args) {

        String a = "SARATH";

        String a1 = new String("SARATH");

        System.out.println(a.toLowerCase(Locale.ROOT));

        System.out.println( a == a1);

        System.out.println(a.equals(a1));

        System.out.println(a.equalsIgnoreCase(a1));





    }



}
