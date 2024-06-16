package soliddesignpattern.dependencyinversionprinciple.good;

public class AddOperations implements CalculatorOperations{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
