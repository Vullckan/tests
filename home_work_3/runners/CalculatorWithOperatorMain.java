package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double stage1 = calculator.divisionMethod(28, 5);
        double stage2 = calculator.exponentiationMethod(stage1, 2);
        double stage3 = calculator.multiplicationMethod(15, 7);
        double result = calculator.additionMethod(calculator.additionMethod(4.1, stage3), stage2);
        System.out.println(result);
    }
}
