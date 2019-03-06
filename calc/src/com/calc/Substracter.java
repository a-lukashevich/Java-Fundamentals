package com.calc;

public class Substracter extends CalculateBase {
    public Substracter() {}
    public Substracter(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double val = getLeftVal() - getRightVal();
        setResult(val);
    }
}
