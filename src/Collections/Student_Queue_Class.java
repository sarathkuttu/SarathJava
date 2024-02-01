package src.Collections;

import java.util.Comparator;

public class Student_Queue_Class implements Comparable <Student_Queue_Class>{


    String Name;

    public Student_Queue_Class(String name, Integer ID) {
        Name = name;
        this.ID = ID;
    }

    Integer ID;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student_Queue_Class{" +
                "Name='" + Name + '\'' +
                ", ID=" + ID +
                '}';
    }


    @Override
    public int compareTo(Student_Queue_Class o) {
        return Integer.compare(this.ID,o.ID);
    }
}


