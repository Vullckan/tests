package sorts;

import utils.ArraysUtils;
import utils.SortUtils;

import java.util.Arrays;

public class Sorts {

    public static void printBubbleSort(int[] array){
        System.out.print(Arrays.toString(array));
        System.out.println(" -> " + Arrays.toString(SortUtils.bubbleSort(array)));
    }

    public static void printShakerSort(int[] array){
        System.out.print(Arrays.toString(array));
        System.out.println(" -> " + Arrays.toString(SortUtils.shakerSort(array)));
    }

    public static void main(String[] args) {
        int[] mas1 = {1, 2, 3, 4, 5, 6};
        int[] mas2 = {1, 1, 1, 1};
        int[] mas3 = {9, 1, 5, 99, 9, 9};
        int[] mas4 = {};

        printBubbleSort(mas1);
        printBubbleSort(mas2);
        printBubbleSort(mas3);
        printBubbleSort(mas4);
        System.out.println("----------------------");

        printShakerSort(mas1);
        printShakerSort(mas2);
        printShakerSort(mas3);
        printShakerSort(mas4);
        System.out.println("----------------------");

        int[] masNew1 = ArraysUtils.arrayRandom(6, 100);
        printBubbleSort(masNew1);
        printShakerSort(masNew1);
        System.out.println("----------------------");

        int[] masNew2 = ArraysUtils.arrayFromConsole();
        printBubbleSort(masNew2);
        printShakerSort(masNew2);

    }
}
