package src.OopsNotes;

public class Static2 {

    public static void main(String[] args) {

        System.out.println("DETAILS");
        System.out.println("AGE is " + Static.gender);

        System.out.println("GENDER is " + Static.age);

        Static.age = 29;
        Static.gender = "FEMALE";

        System.out.println("AGE is " + Static.gender);

        System.out.println("GENDER is " + Static.age);


    }
}
