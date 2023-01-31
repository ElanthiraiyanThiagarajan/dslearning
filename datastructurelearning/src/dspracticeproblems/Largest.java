package  dspracticeproblems;
public class Largest{

    static void print3largest(int[] arr,int arr_size){
        int i,first,second,third;
        if(arr_size<3){
            System.out.println("Wrong inputs");
            return;
        }

        first=second=third = Integer.MIN_VALUE;

        for(i=0;i<arr_size;i++){
            if(arr[i]>first){
                third = second;
                second = first;
                first = arr[i];
            }else if(arr[i]>second){
                third = second;
                second = arr[i];

            }else if(arr[i]>third){ 
                third = arr[i];
            }
        }

        System.out.println(first +""+second+""+third);

    }


    static void print2largest(int[] arr,int arr_size){
        int i,first,second;
        if(arr_size<2){
            System.out.println("Wrong inputs");
            return;
        }

        first=second = Integer.MIN_VALUE;

        for(i=0;i<arr_size;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }else if(arr[i]>second && arr[i] != first){
                
                second = arr[i];

            }
        }

        System.out.println(first +""+second);

    }

    public static void main(String[] args) {
        print2largest(new int[]{12, 35, 1, 10, 34, 1}, 6);
    }

}