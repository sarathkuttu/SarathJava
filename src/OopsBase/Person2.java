package src.OopsBase;

public class Person2 {

    String name;

    Person2() {

        System.out.println("DC");
    }

    Person2(String value) {

        this.name = value;
    }

    void Print() {

        System.out.println("The name is " + this.name);
    }

}
