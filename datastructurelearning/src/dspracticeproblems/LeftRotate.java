package  dspracticeproblems;
public class LeftRotate {

    static void leftRotate(int  arr[],int d){
       if(d==0){
        return;
       }
        int n = arr.length;
        d = d%10;

        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);
    }

    static void rightRotate(int arr[],int d){
        int n = arr.length;
        d = d%n;

        for(int i=0;i<n;i++){
            if(i<d){
                System.out.print(arr[n+i-d] + " ");
            }else{
                System.out.print(arr[i-d] + " ");
            }
        }
        System.out.println();

    }

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
        int[] arr = new int[] { 1, 3, 5, 7, 9, 11 };
        rightRotate(arr,3);

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
    }
}
