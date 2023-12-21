package src.Javanotes;

public class Increment {

    public static void main(String[] args) {

        int a = 50;

        System.out.println(++a + a++ + ++a);

        // EXP value=51,  a=51           ++a = 51
        // EXP value=51,  a=52           a++=51
        // EXP value=53,  a=53            ++a = 53

        //51+51+53 = 155 and a = 53

        System.out.println(a);
    }
}
