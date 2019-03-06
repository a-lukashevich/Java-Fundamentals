package com.calc;

public class Divider extends CalculateBase {
    public Divider() {}
    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double val = getRightVal() != 0.0d ? getLeftVal() / getRightVal() : 0.0d;
        setResult(val);
    }
}
