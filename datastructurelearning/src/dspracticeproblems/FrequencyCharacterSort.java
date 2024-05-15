package dspracticeproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCharacterSort {
    public static void main(String[] args) {
        String input = "programming";

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        Collections.sort(entryList, (a, b)->{
            if (a.getValue().equals(b.getValue())){
                return a.getKey().compareTo(b.getKey());
            }
            return b.getValue().compareTo(a.getValue());
        });
        StringBuilder stringBuilder = new StringBuilder();
       for(Map.Entry<Character,Integer>  entry : entryList ){
        char character = entry.getKey();
        Integer frequency = entry.getValue();
        for(var i=0;i<frequency;i++){
            stringBuilder.append(character);

        } 
       }
       System.out.println(stringBuilder.toString());
    }
}
