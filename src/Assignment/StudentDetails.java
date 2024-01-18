package src.Assignment;

public class StudentDetails extends ATB {

    String id;

    public StudentDetails(String Stud, String id) {
        super(Stud);

        this.id = id;
    }

    public void Display() {

        System.out.println("The Student ID is " + this.id);

        super.Display();
    }

    public static void main(String[] args) {

        StudentDetails sd = new StudentDetails("SARATH","123");

        sd.Display();

    }
}
