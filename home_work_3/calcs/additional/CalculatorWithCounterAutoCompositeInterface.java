package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface implements ICalculator{
    private ICalculator calculator;
    private long count;

    public void incrementCountOperation(){
        this.count++;
    }

    public CalculatorWithCounterAutoCompositeInterface(ICalculator calculator){
        this.calculator = calculator;
    }

    public double divisionMethod(double a, double b){
        incrementCountOperation();
        return calculator.divisionMethod(a, b);
    }

    public double multiplicationMethod(double a, double b){
        incrementCountOperation();
        return calculator.multiplicationMethod(a, b);
    }

    public double subtractionMethod(double a, double b){
        incrementCountOperation();
        return calculator.subtractionMethod(a, b);
    }

    public double additionMethod(double a, double b){
        incrementCountOperation();
        return calculator.additionMethod(a, b);
    }

    public double exponentiationMethod(double a, int b){
        incrementCountOperation();
        return calculator.exponentiationMethod(a, b);
    }

    public double moduleMethod(double a){
        incrementCountOperation();
        return calculator.moduleMethod(a);
    }

    public double squareRootMethod(double a){
        incrementCountOperation();
        return calculator.squareRootMethod(a);
    }

    public long getCountOperation(){
        return this.count;
    }
}
