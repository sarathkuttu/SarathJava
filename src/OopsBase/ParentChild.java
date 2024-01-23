package src.OopsBase;

public class ParentChild extends Parent {


    String age;

    ParentChild() {

        System.out.println("CHILD DEFAULT");
    }

    ParentChild(String age) {

        this.age = age;
    }

    void Age() {

        System.out.println("Here is the " + this.age);
    }


}

