package soliddesignpattern.openclosed.interfaces;

public class CalculatorOpenClosed {

    public int calculateNumber(int number1, int number2, Operations operations) {
        return operations.perform(number1, number2);
    }
}
