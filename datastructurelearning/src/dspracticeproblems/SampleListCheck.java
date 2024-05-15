package dspracticeproblems;

import java.util.HashSet;
import java.util.List;

public class SampleListCheck {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 5, 6);
        List<Integer> newList = List.of(1, 2, 3, 4,5,6);

        System.out.println(new HashSet<>(list).containsAll(newList));


    }
}
