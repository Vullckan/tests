package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double stage1 = calculator.divisionMethod(28, 5);
        calculator.incrementCountOperation();
        double stage2 = calculator.exponentiationMethod(stage1, 2);
        calculator.incrementCountOperation();
        double stage3 = calculator.multiplicationMethod(15, 7);
        calculator.incrementCountOperation();
        double result = calculator.additionMethod(calculator.additionMethod(4.1, stage3), stage2);
        calculator.incrementCountOperation();
        calculator.incrementCountOperation();
        System.out.println(result);
        System.out.println(calculator.getCountOperation());
    }
}
