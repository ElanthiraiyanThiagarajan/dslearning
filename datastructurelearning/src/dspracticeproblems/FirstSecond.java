package  dspracticeproblems;
public class FirstSecond {

    static String firstSecond(int[] myArray) {

       

        selectionSort(myArray);
        int first = myArray[0];
        int second = myArray[1];
        for (int i = 0; i < myArray.length; i++) {
            // if (first < myArray[i]) {
            //     first = myArray[i];
            // }

            if (myArray[i] != first && second < myArray[i]) {
                second = myArray[i];
            }

        }

        return first + " " + second;
    }

    static void selectionSort(int[] arr) {
        var length = arr.length;
        for (var i = 0; i < length - 1; i++) {
            var mib_idx = i;
            for (var j = i + 1; j < length; j++) {
                if (arr[j] > arr[mib_idx])
                    mib_idx = j;
            }
            swapping(arr, mib_idx, i);
            // var temp = arr[mib_idx];
            // arr[mib_idx] = arr[i];
            // arr[i] = temp;

        }

        // for (var number : arr) {
        //     System.out.print(number + " ");
        // }

    }

    static void swapping(int[] arr, int i, int j) {
        var temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(firstSecond(new int[] { 84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0 }));
    }

}
