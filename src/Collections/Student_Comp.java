package src.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student_Comp {

    public static void main(String[] args) {

        Student stud = new Student("SARATH", 33);
        Student stud2 = new Student("KEERTHANA", 29);
        Student stud3 = new Student("NAINIKA", 3);

        List<Student> students = new ArrayList<>();

        students.add(stud);
        students.add(stud2);
        students.add(stud3);

        //System.out.println(students);

        //Collections.sort(students);

        //Collections.sort(students, new sortidasc());

        //Collections.sort(students, new sortiddsc());
        //Collections.sort(students, new sortnamedsc());

        Collections.sort(students, new sortnameasc());
        System.out.println(students);
    }


}
