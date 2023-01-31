package dsdefaultprograms;

import java.util.Scanner;

public class HeapDemo {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the elements of array");


        for(int i=0;i<n;i++)
            arr[i] = scanner.nextInt();
        Heap heap = new Heap();
        heap.build_max_heap(arr);
        heap.print_heap(arr);

        System.out.println("maximum element is : "+heap.extract_max(arr));
		heap.print_heap(arr);
		System.out.println("maximum element is : "+heap.extract_max(arr));
		heap.increase_key(arr,6,800);
		heap.print_heap(arr);
        
    }
}
