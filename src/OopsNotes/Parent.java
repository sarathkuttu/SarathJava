package src.OopsNotes;

public class Parent {

    String name;

    Parent() {

        System.out.println("DEFAULT PARENT");
    }

    Parent(String name) {

        this.name = name;
    }


    void Name() {

        System.out.println("Here is the " + name);
    }
}
