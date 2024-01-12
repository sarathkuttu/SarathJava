package src.OopsNotes;

public class Person {

    String name;

    long phone;

    float salary;

    //  Person() {

    //      name = "Nainu";

//System.out.println("Non parameter");
    //   }

    //   Person(String value) {

    //      this.name = value;

    //       System.out.println("Parameter");
    //   }

    //  Person(long value) {

    //      this.phone = value;

    //     System.out.println("Parameter");
    //  }

    //  Person(float value) {

    //     this.salary = value;

    //     System.out.println("Parameter");
    // }

    Person(String name, float salary, long phone) {
        this.name = name;

        this.salary = salary;

        this.phone = phone;
    }

    void print() {

        // System.out.println(name);
        //System.out.println(phone);
        // System.out.println(salary);
        System.out.println("Parameter " + name + phone + salary);
    }
}

