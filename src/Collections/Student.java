package src.Collections;

import java.util.Comparator;

class sortidasc implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getID(), o2.getID());
    }
}

class sortiddsc implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getID(), o1.getID());
    }
}

class sortnameasc implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class sortnamedsc implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

public class Student implements Comparable<Student> {

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return CharSequence.compare(this.name, student.name);
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Student(String name, Integer ID) {
        this.name = name;
        this.ID = ID;
    }

    Integer ID;


//    @Override
//    public int compareTo(Student student) {
//        return Integer.compare(this.ID, student.ID);
//    }


}
