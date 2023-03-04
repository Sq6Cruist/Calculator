package calculator;

import javax.management.OperationsException;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) throws OperationsException {
        RomeArabian calculator = new RomeArabian();
        Scanner console = new Scanner(System.in);
        calculator.arabicNum(console.next(), console.next().charAt(0), console.next());
    }
}