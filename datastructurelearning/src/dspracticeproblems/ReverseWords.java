package dspracticeproblems;

public class ReverseWords {

    public static void main(String[] args) {
        String s = "This is a test";
        char[] str = s.toCharArray();
        char[] res = new char[s.length()+1];
        int i=s.length()-1, j = 0,k=0;
        while(i>=0){
           while(i>=0 && str[i]==' '){
               i--;
           }
           if(i<0) break;
           j=i;
           while(i>=0 && str[i]!=' '){
              i--;
           }
           for(int l=i+1;l<=j;l++){
               res[k++]=str[l];
           }
           res[k++]=' ';
        }
        System.out.println(new String(res,0,k-1));
    }
}
