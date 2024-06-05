package interviewPreparation.functionalProgramming;


import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface Lambda {

    int myMethod(int a,int b);
}

class LambdaImplementation{
    public static void main(String[] args) {
//        new Thread(()-> System.out.println("Thread Started")).start();
//         Runnable r = ()-> System.out.println("Running");
//         r.run();
        int a= 10,b=20;
        String s1 = "tree";
//        Lambda l = String::length;
//        System.out.println(l.myMethod(s1));

//        Lambda l = (x,y)-> System.out.println(x+y);
//        l.myMethod(a,b);
//
//        Lambda l2 = (x,y)-> System.out.println(x*y);
//        l2.myMethod(a,b);

//        Comparator<String> stringComparator = String::compareTo;
//        List<String> stringList = new java.util.ArrayList<>(List.of("b", "a", "c"));
//        stringList.sort(stringComparator);
//        stringList.forEach(System.out::printf);

        Lambda l1 = MathOperation::multiply;
        System.out.println(l1.myMethod(a,b));

    }
}

class MathOperation{
   public static int multiply(int x,int y){
        return x*y;
    }
}
