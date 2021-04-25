package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long count;

    public long getCountOperation(){
        return this.count;
    }

    public void incrementCountOperation(){
        this.count++;
    }

    public double divisionMethod(double a, double b){
        incrementCountOperation();
        return super.divisionMethod(a, b);
    }

    public double multiplicationMethod(double a, double b){
        incrementCountOperation();
        return super.multiplicationMethod(a, b);
    }

    public double subtractionMethod(double a, double b){
        incrementCountOperation();
        return super.subtractionMethod(a, b);
    }

    public double additionMethod(double a, double b){
        incrementCountOperation();
        return super.additionMethod(a, b);
    }

    public double exponentiationMethod(double a, int b){
        incrementCountOperation();
        return super.exponentiationMethod(a, b);
    }

    public double moduleMethod(double a){
        incrementCountOperation();
        return super.moduleMethod(a);
    }

    public double squareRootMethod(double a){
        incrementCountOperation();
        return super.squareRootMethod(a);
    }
}
