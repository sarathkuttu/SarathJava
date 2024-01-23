package src.OopsBase;

public class ABC_Static {

    public static int age = 32;

    public static String name = "SARATH";

    String gender = "MALE";

    public static void Display() {

        System.out.println("NAME IS " + name);
        System.out.println("AGE is " + age);
       // System.out.println("GENDER "+gender);
    }

    void Print(){
        System.out.println("GENDER is "+ gender);
        System.out.println("AGE is "+ age);

    }
}
