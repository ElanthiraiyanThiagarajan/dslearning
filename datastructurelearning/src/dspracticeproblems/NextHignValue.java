package dspracticeproblems;

public class NextHignValue {

   public static void main(String[] args){
        int[] a = new int[]{20,4,5,6,11};
        int[] outPutArray = new int[a.length];
        int length = a.length-1;
        var i = 0;
        var j = 1;
        while(i<=length){
            if(i==length){
                outPutArray[i]=-1;
            }
            boolean check = false;
            int nextHighValue = 0;
            for(var k=j;k<=length;k++){
                if(a[k]>a[i]){
                    check = true;
                    nextHighValue = a[k];
                    break;
                }
            }

            if(check){
                outPutArray[i] = nextHighValue;
            }else{
                outPutArray[i]=-1;
            }
            i++;
            j=i+1;
        }

        for(int o=0;o<outPutArray.length;o++){
            System.out.println(outPutArray[o]);
        }

   }
    
}
