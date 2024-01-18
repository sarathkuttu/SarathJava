package src.OopsNotes;

public class Method_Overloading2 {

    public static void main(String[] args) {

        Method_Overloading MO = new Method_Overloading();

        System.out.println("Adding 2 Integers " + MO.add(5, 15));
        System.out.println("Adding 2 Strings " + MO.add("SARATH ", "T V"));
        System.out.println("Adding 2 Doubles " + MO.add(11.9, 1.2));
        System.out.println("Adding 3 Integers " + MO.add(5, 15, 10));
    }
}
