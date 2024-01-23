package src.OopsBase;

public class ABC_StaticRunner {

    public static void main(String[] args) {


        System.out.println("AGE is " + ABC_Static.age);
        System.out.println("NAME is " + ABC_Static.name);

        ABC_Static.Display();

        ABC_Static a = new ABC_Static();


        a.gender = "FEMALE";


        a.Print();


    }
}
