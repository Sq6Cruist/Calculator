package calculator;

import java.util.Scanner;

class Calcal {
    public static String Calc() {
        String result;
        Scanner console = new Scanner(System.in);
        result = Main.calc(console.nextLine());
        if(result != null) {
            System.out.println(result);
        }
        return "0";
    }
}
