package ru.dianadan;

public class Operation {
    private int a;
    private int b;
    private char operator;
    private boolean isRomanNum;

    public Operation(int a, int b, char operation, boolean isRomanNum) {
        this.a = a;
        this.b = b;
        this.operator = operation;
        this.isRomanNum = isRomanNum;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public char getOperation() {
        return operator;
    }

    public boolean isRomanNum() {
        return isRomanNum;
    }
}
