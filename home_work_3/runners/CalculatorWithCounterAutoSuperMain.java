package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoSuper;
import HomeWork3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        double stage1 = calculator.divisionMethod(28, 5);
        double stage2 = calculator.exponentiationMethod(stage1, 2);
        double stage3 = calculator.multiplicationMethod(15, 7);
        double result = calculator.additionMethod(calculator.additionMethod(4.1, stage3), stage2);
        System.out.println(result);
        System.out.println(calculator.getCountOperation());
    }

}
