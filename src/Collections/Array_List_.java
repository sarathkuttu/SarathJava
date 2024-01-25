package src.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_List_ {

    public static void main(String[] args) {

        List<String> colorList = new ArrayList<>();

        colorList.add("Blue");

        colorList.add("White");

        colorList.set(1, "Red");

        // colorList.remove("Blue");
        // System.out.println(colorList);

        for (int i = 0; i < colorList.size(); i++) {

            System.out.println(colorList.get(i));
        }

        System.out.println("---------------------");

        for (String o : colorList) {

            System.out.println(o);
        }

        System.out.println("---------------------");

        Iterator iterator = colorList.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }

}


