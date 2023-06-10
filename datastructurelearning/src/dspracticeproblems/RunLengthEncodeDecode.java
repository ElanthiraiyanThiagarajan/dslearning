package dspracticeproblems;

public class RunLengthEncodeDecode {

    static String deCode(String input) {
        String res = "";
        int i = 0, j = 1;
        while (j < input.length()) {

            while (j < input.length() && input.charAt(j) < '9') {
                j++;
            }

            Integer cnt = Integer.parseInt(input.substring(i + 1, j));
            for (int k = 0; k < cnt; k++) {
                res += input.charAt(i);
            }
            i=j;
            j++;

        }

        return res;
    }

    static String enCode(String input) {
        String result="";
        char temp = input.charAt(0);
        int i=1,cnt=1;
        while (i<input.length()){
            if(temp==input.charAt(i)){
                cnt++;
            }else{
                result +=temp+""+cnt;
                temp = input.charAt(i);
                cnt = 1;
            }
            if(i==input.length()-1){
                result +=temp+""+cnt;
            }
            i++;
        }


        return result;
    }

    public static void main(String[] args) {
        String decode = deCode("A4N13");
        String encode = enCode(decode);
        System.out.println(encode);
    }

}
