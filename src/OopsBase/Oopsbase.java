package src.OopsBase;

public class Oopsbase {

    public static void main(String[] args) {

        int add = sum(2, 5, 10);

        System.out.println(add);

        print();


    }

    static int sum(int a, int b, int c) {

        return a + b + c;
    }

    static void print() {

        System.out.println("YES");
    }
}

