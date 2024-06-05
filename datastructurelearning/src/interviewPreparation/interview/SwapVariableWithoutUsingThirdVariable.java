package interviewPreparation.interview;

public class SwapVariableWithoutUsingThirdVariable {

    public static void main(String[] args) {
        int x = 10, y = 9;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);

        sumOfDigits(1219);
    }

    static void sumOfDigits(int num) {

        int x = num;
        int y = 0;
        while (x > 0) {
            int z = x%10;
            y = y + z;
            x = x / 10;
        }
        System.out.println(y);

    }
}
