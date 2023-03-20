package calculator;

import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        RomeArabian calculator = new RomeArabian();
        Scanner console = new Scanner(System.in);
        calculator.arabicNum(console.next(), console.next().charAt(0), console.next());
    }
}