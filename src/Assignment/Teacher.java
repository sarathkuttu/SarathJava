package src.Assignment;

public class Teacher extends ATB {

    String Teacher;

    public Teacher(String Stud, String Teacher) {
        super(Stud);

        this.Teacher = Teacher;
    }

    public void Display() {

        System.out.println("Teacher name is " + this.Teacher);

        super.Display();
    }

    public static void main(String[] args) {

        Teacher T = new Teacher("Sarath", "Pramod");
        {

            T.Display();
        }
    }
}
