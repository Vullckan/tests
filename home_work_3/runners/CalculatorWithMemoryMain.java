package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithMemory;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithMathCopy());
//        4.1 + 15 * 7 + (28 / 5) ^ 2

        calculator.additionMethod(calculator.additionMethod(calculator.multiplicationMethod(15, 7),
                calculator.exponentiationMethod(calculator.divisionMethod(28, 5), 2)), 4.1);

        calculator.setLastMemory();
        System.out.println("Значение в памяти: " + calculator.getMemory());
        System.out.println("Количество операций: " + calculator.getCountOperation());
    }
}