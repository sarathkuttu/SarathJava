package JavaBase;

public class Logical2 {

    public static void main(String[] args) {

        // || OR

        System.out.println( true || true);
        System.out.println( true || false);

        System.out.println( false || true);

        System.out.println( false || false);

        // || OR

        System.out.println( true && true);
        System.out.println( true && false);

        System.out.println( false && true);

        System.out.println( false && false);

        int a = 10;

        boolean b =  a > 111 || a < 100;

        boolean c =  a > 111 && a < 100;

        System.out.println(b);

        System.out.println(c);

    }
}
