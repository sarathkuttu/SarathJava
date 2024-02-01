package src.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {


       Map<Integer,String> mobile = new HashMap<>();

       mobile.put(1,"SAMSUNG");
        mobile.put(2,"NOKIA");
        mobile.put(3,"REALME");

        //System.out.println(mobile);

        System.out.println(mobile.get(3));

//        for (Map.Entry<Integer,String> e: mobile.entrySet() ) {
//
//            System.out.println(e.getKey() + "----->"+ e.getValue());

    //}

        mobile.putIfAbsent(4,"ACHAN");

        System.out.println(mobile);

        mobile.remove(4);

        System.out.println(mobile);
    }



}
