package loops;

import java.util.Scanner;

public class HomeWork2_1_2 {

    public static long getMultiplication(long k){
        long multiply = 1L;
        while(k != 0){
            multiply *= (k % 10);
            k/=10;
        }
        return multiply;
    }

    public static void print(long k){
        String txt = "";
        String line = "" + k;
        for (int i = 0; i < line.length() - 1; i++) {
            txt += line.charAt(i) + " * ";
        }
        txt += line.charAt(line.length() - 1) + " = ";
        System.out.print(txt);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите положительное целое число больше нуля:");
        if (input.hasNextDouble() || input.hasNextBigInteger() || input.hasNextLong()) {
            if (input.hasNextBigInteger() || input.hasNextLong()) {
                if (input.hasNextLong()) {
                    String text = input.nextLine();
                    long numb = Long.parseLong(text);
                    if (numb > 0) {
                        print(numb);
                        System.out.println(getMultiplication(numb));
                    } else {
                        if (numb == 0) {
                            System.out.println("Введённое число равно нулю!");
                        }
                        if (numb < 0) {
                            System.out.println("Введённое число меньше нуля!");
                        }
                    }
                } else {
                    System.out.println("Введённое число выходит за пределы расчётов");
                }
            } else {
                System.out.println("Введено не целое число");
            }
        } else {
            System.out.println("Введено не число");
        }
    }
}
