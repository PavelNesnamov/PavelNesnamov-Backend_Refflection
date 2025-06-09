package ait.homework02.calculator;

import ait.homework02.calculator.infra.Calculator;

public class CalculatorAppl {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Wrong number jf arguments");
            return;
        }
        try {
            double res = Calculator.calculate(args[0], args[1], args[2]);
            System.out.println("Result = " + res);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number format");
        } catch (Exception e) {
            System.out.println("Wrong operation");
        }
    }
}
