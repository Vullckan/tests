package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoCompositeInterface calculator = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathCopy());
        double stage1 = calculator.divisionMethod(28, 5);
        double stage2 = calculator.exponentiationMethod(stage1, 2);
        double stage3 = calculator.multiplicationMethod(15, 7);
        double result = calculator.additionMethod(calculator.additionMethod(4.1, stage3), stage2);
        System.out.println(result);
        System.out.println(calculator.getCountOperation());
    }
}
