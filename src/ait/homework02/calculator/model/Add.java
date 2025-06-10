package ait.homework02.calculator.model;

import ait.homework02.calculator.infra.Operation;

public class Add implements Operation {

    @Override
    public double action(double a, double b) {
        return a + b;
    }
}
