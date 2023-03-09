package calculator;

import java.util.InputMismatchException;

public class RomeArabian {
    NumbersAndCount calculator = new NumbersAndCount();
    setOfRomanNumerals romeNumbersSORN = new setOfRomanNumerals();
    String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    boolean isFirstRoman = false;
    boolean isSecondRoman = false;
    boolean isBothRoman = false;

    private boolean checkOperands(String num1, String num2) {
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

    public void arabicNum(String operandOne, char operation, String operandTwo) {
        int result;
        try {
            if (checkOperands(operandOne, operandTwo)) {
                result = calculator.calcult(romeNumbersSORN.rome(operandOne), operation,
                        romeNumbersSORN.rome(operandTwo));
                if (operation == '-' && romeNumbersSORN.rome(operandOne) <= romeNumbersSORN.rome(operandTwo)) {
                    throw new InputMismatchException("В римском исчислении нет отрицательных чисел и 0 !");
                }else if (operation == '/' && romeNumbersSORN.rome(operandOne) <= romeNumbersSORN.rome(operandTwo)){
                    throw new InputMismatchException("В римском счислении есть только Целые числа.");
                }else {
                    System.out.println(romeNumbersSORN.convertNumToRoman(result));
                }
            } else {
                result = calculator.calcult(Integer.parseInt(operandOne), operation,
                        Integer.parseInt(operandTwo));
                System.out.println(result);
            }
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Не верный формат операции.");
            System.out.println("Введите либо Арабские числа(1 + 1) либо Римские числа(I + I)");
        }
    }
}
