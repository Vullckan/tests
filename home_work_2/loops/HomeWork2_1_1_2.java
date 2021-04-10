package loops;

import java.util.Scanner;

public class HomeWork2_1_1_2 {

    public static long recursion(int n) {
        if (n == 1) {
            return 1;
        }
        return recursion(n-1) * n;
    }

    public static void print(int k){
        String txt = "";
        for (int i = 1; i < k; i++) {
            txt += i + " * ";
        }
        txt += k + " = ";
        System.out.print(txt);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите положительное целое число больше нуля:");
        if (input.hasNextInt()) {
            String text = input.nextLine();
            int numb = Integer.parseInt(text);
            if (numb > 0){
                print(numb);
                if (numb < 21){
                    System.out.println(recursion(numb));
                }
                else{
                    System.out.println("Результат вычислений вышел за пределы расчётов");
                }

            } else
            if (numb == 0){
                System.out.println("Введённое число равно нулю!");
            }
            if (numb < 0){
                System.out.println("Введённое число меньше нуля!");
            }

        }
        else {
            System.out.println("Ведённое выражение не является целым числом!");
        }
    }
}