package ait.homework02.calculator.infra;

import java.lang.reflect.InvocationTargetException;

public class Calculator {

    private static final String PACKAGE = "ait.calculator.model";

    public static double calculate(String operand1, String operand2, String oper) throws Exception {

        double a = Double.parseDouble(operand1);
        double b = Double.parseDouble(operand2);
        Class<?> clazz = Class.forName(PACKAGE + oper);

        Operation calc = (Operation) clazz.getDeclaredConstructor().newInstance();
        double res = calc.action(a, b);
        return res;
    }
}
