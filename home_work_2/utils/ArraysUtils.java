package utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    public static int[] arrayFromConsole(){
        System.out.println("Введите размер массива:");
        Scanner input = new Scanner(System.in);
        int dimension = input.nextInt();
        int [] array = new int[dimension];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < dimension; i++) {
            int element = input.nextInt();
            array [i] = element;
        }
        return array;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random random = new Random();
        int element;
        for (int i = 0; i < size; i++) {
            element = random.nextInt(maxValueExclusion);
            array[i] = element;
        }
        return array;
    }


    public static void main(String[] args) {
        int [] a = arrayRandom(8, 99);
        for (int i : a) {
            System.out.print(i + " ");
        }

    }
}