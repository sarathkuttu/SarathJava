package src.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Demo {

    public static void main(String[] args) {

        Set sport = new HashSet();

        sport.add("Cricket");

        sport.add("Tennis");

        System.out.println(sport);

        for (Object set:sport) {

            System.out.println(set);
        }

            System.out.println("-----------------------");

            Iterator it = sport.iterator();

            while (it.hasNext())

                System.out.println(it.next());
            }

        }

