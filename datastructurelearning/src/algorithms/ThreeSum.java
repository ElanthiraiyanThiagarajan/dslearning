package algorithms;
public class ThreeSum {
    private ThreeSum() {

    }

    public static void printAll(int[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        StdOut.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
    }

    public static Integer count(int[] a) {
        int length = a.length, count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] a = in.readAllInts();
        Stopwatch timer = new Stopwatch();
        int count = count(a);
        StdOut.println("Elapsed Time="+timer.elapsedTime());
        StdOut.println(count);
    }
}