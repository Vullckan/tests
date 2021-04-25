package HomeWork3.runners;


import HomeWork3.calcs.additional.CalculatorWithCounterAutoDecorator;
import HomeWork3.calcs.additional.CalculatorWithMemoryDecorator;
import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        double result = calculator.additionMethod(calculator.additionMethod(calculator.multiplicationMethod(15, 7),
                calculator.exponentiationMethod(calculator.divisionMethod(28, 5), 2)), 4.1);
        System.out.println(result);

        if (calculator instanceof CalculatorWithCounterAutoDecorator) {
            long count = ((CalculatorWithCounterAutoDecorator) calculator).getCountOperation();
            System.out.println("Калькулятор был использован " + count + " раз.");

            ICalculator calculator2 = (((CalculatorWithCounterAutoDecorator) calculator).getCalculator());
            if (calculator2 instanceof CalculatorWithMemoryDecorator) {
                ((CalculatorWithMemoryDecorator) calculator2).setLastMemory();
                double memory = ((CalculatorWithMemoryDecorator) calculator2).getMemory();
                System.out.println("Результат последнего сохранения в памяти калькулятора: " + memory);
            }
        }
    }
}