package calculator;

public class NumbersAndCount {

    private boolean numberCheck(int nomber1, int nomber2) {

        return nomber1 > 0 && nomber1 <= 10 && nomber2 > 0 && nomber2 <= 10;
    }

    public int calcult(int numberOne, char sing, int numberTwo) {
        int result = 0;
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

