package src.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_Class {

    public static void main(String[] args) {

        Student_Queue_Class stud1 = new Student_Queue_Class("SARATH",222);
        Student_Queue_Class stud2 = new Student_Queue_Class("AMMU",1);
        Student_Queue_Class stud3 = new Student_Queue_Class("CHAKKU",32);


        PriorityQueue <Student_Queue_Class> Students = new PriorityQueue<>();

        Students.add(stud1);
        Students.add(stud2);
        Students.add(stud3);

        //System.out.println(Students);

        while (!Students.isEmpty()) {
          System.out.println(Students.poll());
       }


        }
    }


