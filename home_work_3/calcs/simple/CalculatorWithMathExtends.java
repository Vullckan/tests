package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    public double exponentiationMethod(double a, double b){
        return Math.pow(a, b);
    }

    public double moduleMethod(double a){
        return Math.abs(a);
    }

    public double squareRootMethod(double a){
        return Math.sqrt(a);
    }
}
