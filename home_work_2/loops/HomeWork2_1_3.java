package loops;

import java.util.Scanner;

public class HomeWork2_1_3 {

    public static float degreeOfNumber(double a, int b) {
        float result = 1f;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static void print(double a, int b) {
        String txt = "";
        txt += a + " ^ " + b + " = ";
        System.out.print(txt);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        if (input.hasNextDouble()) {
            double basis = input.nextDouble();
            System.out.println("Введите показатель степени (положительное целое число):");
            if (input.hasNextInt() || input.hasNextDouble()) {
                if (input.hasNextInt()) {
                    int degree = input.nextInt();
                    if (degree > 0) {
                        print(basis, degree);
                        System.out.println(degreeOfNumber(basis, degree));
                    } else {
                        if (degree == 0) {
                            System.out.println("Введённое число равно нулю! Дальнейшие вычисления невозможны.");
                        }
                        if (degree < 0) {
                            System.out.println("Введённое число меньше нуля! Дальнейшие вычисления невозможны.");
                        }
                    }
                } else {
                    System.out.println("Ведённое число не является целым! Дальнейшие вычисления невозможны.");
                }
            } else {
                System.out.println("Ведённое выражение не является числом! Дальнейшие вычисления невозможны.");
            }
        } else {
            System.out.println("Ведённое выражение не является числом! Дальнейшие вычисления невозможны.");
        }
    }
}