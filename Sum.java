package calculator;

import java.util.Scanner;

class Sum {
    public static void main(String[] args) {

        String result;
        Scanner console = new Scanner(System.in);
        result = Main.calc(console.nextLine());
        if(result != null) {
            System.out.println(result);
        }

    }
}