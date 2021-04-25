package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
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
        double result = 1;
        if (b == 0){
            return 1;
        }
        else if (b < 0){
            for (int i = b; i < 0; i++) {
                result *= a;
            }
            return 1 / result;
        }
        else {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        }
    }

    public double moduleMethod(double a){
        if (a < 0){
            return -a;
        }
        else{
            return a;
        }
    }

    public double squareRootMethod(double a) {           // Используется итерационная формула Герона
        double err = 0.001;
        double x0 = a;
        double x1 = 1 / 2.0 * (x0 + a / x0);
        double d = Math.abs(x1 - x0);
        while (d >= 2 * err && d * d >= 2 * err) {
            x0 = x1;
            x1 = 1 / 2.0 * (x0 + a / x0);
            d = Math.abs(x1 - x0);
        }
        return x1;
    }
}
