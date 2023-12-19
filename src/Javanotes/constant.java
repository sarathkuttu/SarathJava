package src.Javanotes;

public class constant {

    public static void main(String[] args) {

        //can assign a value to a  variable multiple time if not final

        float a = 123.22f;
        System.out.println(a);

        a = 999.99f;
//cannot assign a value to a final variable
        final float b = 123.22f;
        System.out.println(b);

        b = 999.99f;

        System.out.println(b);

    }


}
