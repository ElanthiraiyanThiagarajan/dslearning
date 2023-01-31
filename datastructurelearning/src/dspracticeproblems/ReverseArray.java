package  dspracticeproblems;
class ReverseArray {

    static void reverseArray(int[] arr,int start,int end) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }



    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };
        reverseArray(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}