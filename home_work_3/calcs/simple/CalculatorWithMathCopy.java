package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double divisionMethod(double a, double b){
        return a / b;
    }

    public double multiplicationMethod(double a, double b){
        return a * b;
    }

    public double subtractionMethod(double a, double b){
        return a - b;
    }

    public double additionMethod(double a, double b){
        return a + b;
    }

    public double exponentiationMethod(double a, int b){
        return Math.pow(a, b);
    }

    public double moduleMethod(double a){
        return Math.abs(a);
    }

    public double squareRootMethod(double a){
        return Math.sqrt(a);
    }
}
