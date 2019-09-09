package ru.dianadan;

public class Calculator {

    private Calculator() {

    }

    public static Calculator getInstance() {
        return new Calculator();
    }

    private static String getResult(Operation operation) {
        if (operation == null) throw new IllegalArgumentException();
        int a = operation.getA();
        int b = operation.getB();
        char operator = operation.getOperation();
        double result;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = (double) a / b;
                break;
            default:
                throw new IllegalArgumentException();
        }


        if (operation.isRomanNum()) {
            if (result < 0) return "-" + RomanNum.toRoman(-(int) result);

            return RomanNum.toRoman((int) result);
        }
        return String.valueOf(result);

    }

    public void calculate(String str) {
        System.out.println(getResult(Validator.getOperation(str)));
    }
}
