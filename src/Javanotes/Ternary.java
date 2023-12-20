package src.Javanotes;

public class Ternary {

    public static void main(String[] args) {

        int a = (30 > 20) ? 199:10;

        int b = false ? 199:10;

        System.out.println(a);

        System.out.println(b);

        //MAX and MIN

        int c = 50;

        int d = 90;

        int max = d > c ? d:c;

        System.out.println(max);

        int min = d > c ? c:d;

        System.out.println(min);

        int a1 = 100;

        int b1 = 200;

        int c1 = 10;

        int MAX = a1 > b1 ? a1 >c1 ? a1 :c1 : b1 > c1 ? b1 :c1;

        System.out.println(MAX);


    }
}
