package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;

    private long count;

    public void incrementCountOperation(){
        this.count++;
    }

    public long getCountOperation(){
        return this.count;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculator){
        this.calculator1 = calculator;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculator){
        this.calculator2 = calculator;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculator){
        this.calculator3 = calculator;
    }

    public double divisionMethod(double a, double b){
        incrementCountOperation();
        if (calculator1 != null){
            return calculator1.divisionMethod(a, b);
        } else if (calculator2 != null){
            return calculator2.divisionMethod(a, b);
        } else {
            return calculator3.divisionMethod(a, b);
        }
    }

    public double multiplicationMethod(double a, double b){
        incrementCountOperation();
        if (calculator1 != null){
            return calculator1.multiplicationMethod(a, b);
        } else if (calculator2 != null){
            return calculator2.multiplicationMethod(a, b);
        } else {
            return calculator3.multiplicationMethod(a, b);
        }
    }

    public double subtractionMethod(double a, double b){
        incrementCountOperation();
        if (calculator1 != null){
            return calculator1.subtractionMethod(a, b);
        } else if (calculator2 != null){
            return calculator2.subtractionMethod(a, b);
        } else {
            return calculator3.subtractionMethod(a, b);
        }
    }

    public double additionMethod(double a, double b){
        incrementCountOperation();
        if (calculator1 != null){
            return calculator1.additionMethod(a, b);
        } else if (calculator2 != null){
            return calculator2.additionMethod(a, b);
        } else {
            return calculator3.additionMethod(a, b);
        }
    }

    public double exponentiationMethod(double a, int b){
        incrementCountOperation();
        if (calculator1 != null){
            return calculator1.exponentiationMethod(a, b);
        } else if (calculator2 != null){
            return calculator2.exponentiationMethod(a, b);
        } else {
            return calculator3.exponentiationMethod(a, b);
        }
    }

    public double moduleMethod(double a){
        incrementCountOperation();
        if (calculator1 != null){
            return calculator1.moduleMethod(a);
        } else if (calculator2 != null){
            return calculator2.moduleMethod(a);
        } else {
            return calculator3.moduleMethod(a);
        }
    }

    public double squareRootMethod(double a){
        incrementCountOperation();
        if (calculator1 != null){
            return calculator1.squareRootMethod(a);
        } else if (calculator2 != null){
            return calculator2.squareRootMethod(a);
        } else {
            return calculator3.squareRootMethod(a);
        }
    }
}
