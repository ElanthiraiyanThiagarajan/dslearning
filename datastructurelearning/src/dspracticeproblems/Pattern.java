package  dspracticeproblems;
public class Pattern {
    public static void main(String[] args) {
        String s = "12345";
        int len = s.length();

        for(int i=0;i<len;i++){
            int k = len-1-i;
            for(int j=0;j<len;j++){
                
                if(i==j || j==k){
                    System.out.print(s.charAt(k));
                }else{
                    System.out.print(" ");
                }
                

            }
            System.out.println();
        }

    }
}
