package algorithmsdefaultProgram;
import java.util.Scanner;

public class LinearSearchAlgorithmsSample {
    
    public static void main(String[] args) {
        int[] a= new int[]{1,2,3,4,5,6,7,8};
        Scanner s1= new Scanner(System.in);

        System.out.println("Enter the value to search");
        int key = s1.nextInt();

        boolean check = false;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                check=true;
                System.out.println("The Given key has been found at the index of the array"+i);
                break;
            }
        }
        if(!check){
            System.out.println("The Given key is not able to found in the Array");
        }
    }
}
