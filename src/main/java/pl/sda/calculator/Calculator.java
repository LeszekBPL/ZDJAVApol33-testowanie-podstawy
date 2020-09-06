package pl.sda.calculator;

public class Calculator {

    public int add(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public boolean isDividableByThree(int arg) {
        return arg % 3 == 0;
    }

    public int substract(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public int multiplication(int arg1, int agr2) {
        return arg1 * agr2;
    }

    public int division(int arg1, int arg2) {
        if (arg2 == 0) {
            return 0;
        } else
            return arg1 / arg2;
    }

    public boolean isItEven(int arg1) {
        return arg1 % 2 == 0;
    }

    public boolean isOddValue(int arg1) {
        return arg1 % 2 == 1;
    }

    public double precentageOfNumber(double arg1, double arg2) {
        return (arg1 * arg2) / 100.0d;
    }
}
