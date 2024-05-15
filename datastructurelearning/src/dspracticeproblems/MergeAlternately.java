package dspracticeproblems;

public class MergeAlternately {

    static String mergeAlternately(String a, String b) {
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        int l = a.length();
        int m = b.length();
        char[] result = new char[l+m];

        int j=0,k=0;
        for (int i = 0; i <l+m;i++){
            if(j<l){
              result[i] = aArray[j];
              j++;
            }else{
                i--;
            }
            if(k<m){
                result[++i] = bArray[k];
                k++;
            }
        }


        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "123"));
    }
}
