package dspracticeproblems;

import util.DataStructureUTIL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Concatenation {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1};
        int[] output = new int[arr.length*2];

//        for(int i=0;i<arr.length;i++){
//            output[i] = arr[i];
//            output[i+arr.length]=arr[i];
//
//        }
        System.arraycopy(arr,0,output,0,arr.length);
        System.arraycopy(arr,0,output,arr.length,arr.length);
        System.out.println(Arrays.toString(output));
    }
}
