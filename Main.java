package calculator;

import java.util.InputMismatchException;

class Main {
    static NumbersAndCount calculator = new NumbersAndCount();
    static setOfRomanNumerals romeNumbersSORN = new setOfRomanNumerals();
    static String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    static boolean isFirstRoman = false;
    static boolean isSecondRoman = false;
    static boolean isBothRoman = false;

    private static boolean checkOperands(String num1, String num2) {
        for (String s : roman) {
            if (num1.equalsIgnoreCase(s)) {
                isFirstRoman = true;
            }
            if (num2.equalsIgnoreCase(s)) {
                isSecondRoman = true;
            }
        }
        isBothRoman = isFirstRoman && isSecondRoman;
        return isBothRoman;
    }

    public static String calc(String input) {
        String result = null;
        try {
            String[] SplittingAStringIntaValues = input.split(" ", 5);
            String operandOne = SplittingAStringIntaValues[0];
            char operation = SplittingAStringIntaValues[1].charAt(0);
            String operandTwo = SplittingAStringIntaValues[2];
            if (checkOperands(operandOne, operandTwo)) {
                result = String.valueOf(calculator.calcult(romeNumbersSORN.rome(operandOne), operation,
                        romeNumbersSORN.rome(operandTwo)));
                if (operation == '-' && romeNumbersSORN.rome(operandOne) <= romeNumbersSORN.rome(operandTwo)) {
                    throw new ThereAreNoNegativeNumbersInRomanNumerals("В римском исчислении нет отрицательных чисел и O!");
                } else if (operation == '/' && romeNumbersSORN.rome(operandOne) < romeNumbersSORN.rome(operandTwo)) {
                    throw new ThereAreNoFractionalNumbersInRomanNumerals("В римском исчислении нет дробных чисел!");
                } else {
                    result = romeNumbersSORN.convertNumToRoman(Integer.parseInt(result));
                }
            } else {
                result = String.valueOf(calculator.calcult(Integer.parseInt(operandOne), operation,
                        Integer.parseInt(operandTwo)));
            }
        } catch (InputMismatchException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Не верный формат операции.");
            System.err.println("Введите либо Арабские числа в формате (1 + 1) либо Римские числа в формате (I + I)");
        }
        return result;
    }
}
