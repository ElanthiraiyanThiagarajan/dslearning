package dspracticeproblems;

public class SampleProgram {

    public static void main(String[] args) {
        String x ="XAZ_AZAP_PF_MDS_XN";
        System.out.println(x.substring(x.lastIndexOf("_") + 1));
    }
}
