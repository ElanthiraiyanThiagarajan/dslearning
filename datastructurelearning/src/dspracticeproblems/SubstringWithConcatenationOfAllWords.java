package dspracticeproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationOfAllWords {

    public static void main(String[] args) {
        // System.out.println(findSubstring("barfoothefoobarman", new
        // String[]{"foo","bar"}));
        // System.out.println(findSubstring("wordgoodgoodgoodbestword", new String[] { "word", "good", "best", "word" }));
        System.out.println(findSubstring("barfoofoobarthefoobarman",new String[]{"bar","foo","the"}));

    }

    static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        int givenStringLength = s.length();
        int wordsArrayLength = words.length;
        int singleWordLengthInArray = words[0].length();
        Map<String, Integer> wordsCountMap = new HashMap<>();
        for (String w : words) {
            wordsCountMap.merge(w, 1, Integer::sum);
        }

        for (int i = 0; i < singleWordLengthInArray; i++) {
            int j = i, k = i, count = 0;
            Map<String, Integer> wordsCountMap1 = new HashMap<>();
            while (k + singleWordLengthInArray < givenStringLength) {
                String currentWord = s.substring(k, k + singleWordLengthInArray);
                k += singleWordLengthInArray;
                if (!wordsCountMap.containsKey(currentWord)) {
                    j = k;
                    count = 0;
                    wordsCountMap1.clear();
                    continue;
                }
                wordsCountMap1.merge(currentWord, 1, Integer::sum);
                count++;

                while (wordsCountMap1.get(currentWord) > wordsCountMap.get(currentWord)) {
                    String remove = s.substring(j, j + singleWordLengthInArray);
                    j += singleWordLengthInArray;
                    count--;
                    wordsCountMap1.merge(remove, -1, Integer::sum);
                }

                if (count == wordsArrayLength) {
                    result.add(j);
                }
            }

        }

        return result;

    }
}
