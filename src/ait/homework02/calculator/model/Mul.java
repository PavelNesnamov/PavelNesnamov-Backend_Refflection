package ait.homework02.calculator.model;

import ait.homework02.calculator.infra.Operatoin;

public class Mul implements Operatoin {

    @Override
    public double action(double a, double b) {
        return a * b;
    }
}