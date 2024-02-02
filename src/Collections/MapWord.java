package src.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapWord {

    public static void main(String[] args) {

        String msg = "I am SARATH yes a new SARATH";

        Map<String,Integer> word = new HashMap<>();

        String [] wordsplit = msg.split(" ");

        for (String s:wordsplit) {

           // s = s.toLowerCase(); // Convert to lowercase

            Integer count = word.get(s);

            if (count == null) {

                word.put(s, 1);

            }else{

                word.put(s,count+1);


            }
            
        }

        System.out.println(word);
    }
}
