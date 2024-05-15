package dspracticeproblems;

public class ReverseVowels {

    public static void main(String[] args) {
        String s = "hello";
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        int start = 0,end = arr.length - 1;
        while(start < end) {
            while(start < end &&!vowels.contains(String.valueOf(arr[start]))) {
                start++;
            }
            while(start < end &&!vowels.contains(String.valueOf(arr[end]))) {
                end--;
            }
            if(start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        String result = String.valueOf(arr);
        System.out.println(result);
    }
}
