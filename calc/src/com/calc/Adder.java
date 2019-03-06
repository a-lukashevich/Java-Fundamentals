package com.calc;

public class Adder extends CalculateBase {
    public Adder() {}
    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double val = getLeftVal() + getRightVal();
        setResult(val);
    }
}
