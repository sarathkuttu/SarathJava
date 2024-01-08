package JavaBase;

public class Decrement {

    public static void main(String[] args) {

        int a = 50;

        System.out.println(--a + a-- + --a);

        // EXP value=49,  a=49           --a = 49
        // EXP value=49,  a=48           a--=49
        // EXP value=47,  a=47           --a = 47

        //49+49+47 = 145 and a = 47

        System.out.println(a);
    }

}
