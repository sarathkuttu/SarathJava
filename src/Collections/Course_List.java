package src.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Course_List {

    public static void main(String[] args) {

        List courselist = new ArrayList();

        courselist.add("SARATH");
        courselist.add("AMMU");
        courselist.add("NAINIKA");

        List marklist = new ArrayList();

        marklist.add(99);
        marklist.add(100);
        marklist.add(90);

        courselist.addAll(marklist);

        System.out.println(courselist);

        Iterator iterator = courselist.iterator();

        while (iterator.hasNext()) {


            System.out.println(iterator.next());

        }

        Collections.sort(marklist);
        System.out.println(marklist);

    }
}
