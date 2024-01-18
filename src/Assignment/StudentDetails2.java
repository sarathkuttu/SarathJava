package src.Assignment;

public class StudentDetails2 extends StudentDetails {

    int age;

    public StudentDetails2(String Stud, String id, int age) {
        super(Stud, id);

        this.age = age;
    }

    public void Display() {

        System.out.println("Student age is " + this.age);

        super.Display();
    }

    public static void main(String[] args) {
        StudentDetails2 stud2 = new StudentDetails2("AMMU", "12345", 33);

        stud2.Display();
    }


}
