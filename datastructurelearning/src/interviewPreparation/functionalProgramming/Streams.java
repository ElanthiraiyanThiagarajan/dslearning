package interviewPreparation.functionalProgramming;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<String> stringList = List.of("a","b","c","a","b","c","c");

        List<String> removeDuplicate = stringList.stream().distinct().toList();

        System.out.println(removeDuplicate);

        Map<String,Long> mapCount = stringList.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(mapCount);

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i")
        );

        List<String> list = listOfLists.stream().flatMap(List::stream).distinct().toList();
        System.out.println(list);



    }
}
