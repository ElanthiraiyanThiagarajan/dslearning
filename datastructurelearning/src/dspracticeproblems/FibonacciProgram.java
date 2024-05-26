package dspracticeproblems;

import algorithms.StdOut;
import algorithms.Stopwatch;

public class FibonacciProgram {


    static int normalMethod(int n){
        int a=0,b=1,c;
        if(n <= 1){
            return n;
        }

        for(int i=2;i<=n;i++){
            c= a+b;
            a=b;
            b=c;
        }

        return b;
    }

    //Recursion
    static int fibonacciRecursion(int n){
        if(n<=1){
            return n;
        }

        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }

    static int dynamicApproach(int n){
        int[] f = new int[n+2];
        f[0]= 0;
        f[1]=1;
        for(int i=2;i<=n;i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }


    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        System.out.println(normalMethod(9));

        StdOut.println("Elaspsed Time 1"+ stopwatch.elapsedTime());

        System.out.println(fibonacciRecursion(9));

        StdOut.println("Elaspsed Time 2"+ stopwatch.elapsedTime());
        System.out.println(dynamicApproach(9));

        StdOut.println("Elaspsed Time 3"+ stopwatch.elapsedTime());

    }
}
