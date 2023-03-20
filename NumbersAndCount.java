package calculator;

class NumbersAndCount {

    private boolean numberCheck(int number1, int number2) {

        return number1 > 0 && number1 <= 10 && number2 > 0 && number2 <= 10;
    }

    public int calcult(int numberOne, char sing, int numberTwo) {
        int result;
        if (!numberCheck(numberOne, numberTwo)) {
            throw new NumberAboveTenOrLessThanZeroException("Введи число от 1-10!");
            //вывод ошибки если пользователь ввел не верное число.
        }
        switch (sing) {
            case '+':
                result = numberOne + numberTwo;
                break;
            case '-':
                result = numberOne - numberTwo;
                break;
            case '*':
                result = numberOne * numberTwo;
                break;
            case '/':
                result = numberOne / numberTwo;
                break;
            default:
                throw new RuntimeException("Мне кажется чтото пошло нет так ?");//вывод ошибки на экран.
        }
        return result;
    }
}

