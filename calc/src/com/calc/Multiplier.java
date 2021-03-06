package com.calc;

public class Multiplier extends CalculateBase {
    public Multiplier() {}
    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double val = getLeftVal() * getRightVal();
        setResult(val);
    }
}
