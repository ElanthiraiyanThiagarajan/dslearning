package dspracticeproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String s1 = "Helloworld";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i <s1.length(); i++) {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        List<Character> duplicateElement = new ArrayList<Character>();
        map.forEach((key,value)->{
            if(value>1){
                duplicateElement.add(key);
            }
        });
        System.out.println(duplicateElement);

    }
}
