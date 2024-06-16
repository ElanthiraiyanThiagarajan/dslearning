package soliddesignpattern.openclosed.interfaces;

public class InterfaceImplementation {

    public static void main(String[] args) {
        CalculatorOpenClosed calculatorOpenClosed = new CalculatorOpenClosed();
        System.out.println(calculatorOpenClosed.calculateNumber(1,2,new Addition()));
    }
}
