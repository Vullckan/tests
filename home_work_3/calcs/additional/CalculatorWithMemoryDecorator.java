package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator{
    private final ICalculator calculator;
    private long count;
    private double memory;
    private double result;

    public CalculatorWithMemoryDecorator(ICalculator calculator){
        this.calculator = calculator;
    }

    public ICalculator getCalculator(){
        return calculator;
    }

    public void incrementCountOperation(){
        this.count++;
    }

    public double getMemory(){
        double memoryNew = this.memory;
        this.memory = 0;
        return memoryNew;
    }

    public void setLastMemory(){
        this.memory = this.result;
    }

    public double divisionMethod(double a, double b){
        incrementCountOperation();
        this.result = calculator.divisionMethod(a, b);
        return result;
    }

    public double multiplicationMethod(double a, double b){
        incrementCountOperation();
        this.result = calculator.multiplicationMethod(a, b);
        return result;
    }

    public double subtractionMethod(double a, double b){
        incrementCountOperation();
        this.result = calculator.subtractionMethod(a, b);
        return result;
    }

    public double additionMethod(double a, double b){
        incrementCountOperation();
        this.result = calculator.additionMethod(a, b);
        return result;
    }

    public double exponentiationMethod(double a, int b){
        incrementCountOperation();
        this.result = calculator.exponentiationMethod(a, b);
        return result;
    }

    public double moduleMethod(double a){
        incrementCountOperation();
        this.result = calculator.moduleMethod(a);
        return result;
    }

    public double squareRootMethod(double a){
        incrementCountOperation();
        this.result = calculator.squareRootMethod(a);
        return result;
    }

    public long getCountOperation(){
        return this.count;
    }
}
