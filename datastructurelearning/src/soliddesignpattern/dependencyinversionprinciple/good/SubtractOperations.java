package soliddesignpattern.dependencyinversionprinciple.good;

public class SubtractOperations implements CalculatorOperations{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
