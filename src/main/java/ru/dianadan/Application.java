package ru.dianadan;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = Calculator.getInstance();
        System.out.println("Доступные операции: сложение(+), вычитание(-), умножение(*) и деление(/)" +
                " двух арабских или римских чисел от 1 до 10. Для выхода введите \"q\"");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            if (line.equals("q")) break;
            calculator.calculate(line);
        }


    }
}
