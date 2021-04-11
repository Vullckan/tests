package arrays;

import utils.ArraysUtils;

import java.util.Scanner;

public class HomeWork2_2_4 {

    public static void sumEvenPositiveNumbers(){
        int sum = 0;
        int maxValueExclusion = 100;
        int [] array = ArraysUtils.arrayRandom(5, maxValueExclusion);
        int [] temp = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i] - maxValueExclusion / 2;
        }
        for (int i : temp) {
            System.out.print(i + "\t");
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 0 && temp[i] % 2 == 0){
                sum += temp[i];
            }
        }
        System.out.println("\n" + sum);
        System.out.println("-------------------");
    }

    public static void maxByElementsOfEven(int [] array){
        int max;
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int a : array) {
            System.out.print(a + "\t");
        }
        System.out.println();
        max = 0;
        for (int i = 2; i < array.length; i += 2) {
            if (array[i] > array[max]){
                max = i;
            }
        }
        System.out.println("№ " + max + ": " + array[max]);
        System.out.println("-------------------");
    }

    public static void elementsByLessOfArithmeticMean(int [] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
            sum += array[i];
        }
        System.out.println();
        int average = sum / array.length;
        System.out.println(average);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < average){
                System.out.print(array[i] + "  ");
            }
        }
        System.out.println("\n-------------------");
    }

    public static void twoMinElements(int [] array){
        int min1, min2, buff;
        for (int i : array) {
            System.out.print(i + "  ");
        }
        System.out.println();
        if (array[0] < array[1]){
            min1 = 0;
            min2 = 1;
        }
        else {
            min1 = 1;
            min2 = 0;
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] < array[min1]) {
                buff = min1;
                min1 = i;
                if (array[buff] < array[min2]) {
                    min2 = buff;
                }
            }else {
                    if (array[i] < array[min2]) {
                        min2 = i;
                    }
                }
            }
        System.out.println("№ " + min1 + ": " + array[min1]);
        System.out.println("№ " + min2 + ": " + array[min2]);
        System.out.println("-------------------");
    }

    public static void compressAnArray(){
        int maxValueExclusion = 100;
        System.out.println("Границы массива: \t 0 \t" + maxValueExclusion);
        int [] array = ArraysUtils.arrayRandom(5, maxValueExclusion);
        for (int a : array) {
            System.out.print(a + "\t");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите нижнюю границу удаляемого диапазона:");
        int low = scanner.nextInt();
        System.out.println("Введите верхнюю границу удаляемого диапазона");
        int high = scanner.nextInt();
        System.out.println("Удаляемый диапазон: " + low + "\t" + high);
        int i = 0;
        int m = array.length;
        while (i < m){
            if (array[i] <= high && array[i] >= low){
                m -= 1;
                for (int j = i; j < m; j++) {
                    array[j] = array[j + 1];
                }
            }
            else{
                i += 1;
            }
        }
        for (int j = m; j < array.length; j++) {
            array[j] = 0;
        }
        for (int a : array){
            System.out.print(a + "\t");
        }
        System.out.println("\n--------------------");
    }

    public static void sumDigits(int [] array){
        int sum = 0;
        int num;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            num = array[i];
            while (num > 0){
                sum += num % 10;
                num /= 10;
            }
        }
        System.out.println("\n" + sum);
    }

    public static void main(String[] args) {
        sumEvenPositiveNumbers();
        maxByElementsOfEven(ArraysUtils.arrayRandom(5,100));
        elementsByLessOfArithmeticMean(ArraysUtils.arrayRandom(5, 100));
        twoMinElements(ArraysUtils.arrayRandom(5, 100));
        compressAnArray();
        sumDigits(ArraysUtils.arrayRandom(5, 100));
    }
}
