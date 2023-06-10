package dspracticeproblems;

import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

import edu.princeton.cs.algs4.Out;

public class ABC {
    public static void main(String[] args) {
        // var x = 1;
        // x++;
        // stringChange(x);
        // System.out.println(x);

        // TreeSet<String> treeSet = new TreeSet<>();
        // treeSet.add("Geeks");
        // treeSet.add("for");
        // treeSet.add("Geeks");

        // treeSet.forEach(x->System.out.print(x));

        BiFunction <String, String ,Boolean > compareString = (x,y) ->x.equals(y);
        System.out.println(compareString.apply("java8", "java8"));

        IntStream.of(1,1,3,3,7,6,7).distinct().parallel().map(i-> i*2).sequential().forEach(System.out::print);

    }

   public static void stringChange(int y){
        y = y+2;
    }
}
