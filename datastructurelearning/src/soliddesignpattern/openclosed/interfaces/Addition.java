package soliddesignpattern.openclosed.interfaces;

public class Addition implements Operations {
    @Override
    public int perform(int number1, int number2) {
        return number1 + number2;
    }
}
