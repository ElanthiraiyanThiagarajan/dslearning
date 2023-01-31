package algorithms;

public class UniqueChars {

    boolean isUniqueChars(String a) {
        if (a.length() > 128)
            return false;
        boolean[] arr_unique_chars = new boolean[128];
        for (int i = 0; i < a.length(); i++) {
            var val = a.charAt(i);
            if (arr_unique_chars[val]) {
                return false;
            }
            arr_unique_chars[val] = true;
        }
        return true;
    }

    boolean isUniqueCharcters(String a) {
        int checker = 0;
        for(var i=0;i<a.length();i++){
            int val = a.charAt(i)-'a';
            if((checker&(1<<val))>0){
                return false;
            }
            checker |= (1<<val);
        }
        return true;
    }

    public static void main(String[] args) {
        Stopwatch stopwatchCPU = new Stopwatch();
        UniqueChars uniqueChars = new UniqueChars();
        uniqueChars.isUniqueCharcters("abcdefghijklmno");
        StdOut.println("Elapsed Time=" + stopwatchCPU.elapsedTime());

    }
}
