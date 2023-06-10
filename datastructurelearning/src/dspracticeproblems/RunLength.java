package  dspracticeproblems;
public class RunLength {

    public static void main(String[] args) {
        // String s = "a1b3c4";

        int i = 0, j = 1;
        String res = "";
        // while (j < s.length()) {

        //     while (j < s.length() && s.charAt(j) <= '9') {
        //         j++;
        //     }

        //     var cnt = Integer.parseInt(s.substring(i + 1, j));

        //     for (var k = 0; k < cnt; k++) {
        //         res += s.charAt(i);
        //     }

        //     i = j;
        //     j++;

        // }
        // System.out.println(res);
        i = 0;
        String s2 = "abbbcccc";
        int cnt = 0;
        char temp = s2.charAt(0);
         while (i < s2.length()) {
             if (temp == s2.charAt(i)) {
                 cnt++;
             } else {
                 System.out.print(temp + "" + cnt);
                 temp = s2.charAt(i);
                 cnt = 1;
             }
             if(i==s2.length()-1){
                 System.out.print(temp + "" + cnt);
             }
             i++;
         }

//        for(i=0;i<s2.length();i++){
//            res+=s2.charAt(i);
//            j=1;
//            while(i+1<s2.length() && s2.charAt(i)==s2.charAt(i+1)){
//                i++;
//                j++;
//            }
//
//            res+=j+"";
//
//
//        }
        System.out.println(res);

    }

}