package arrays;

import utils.ArraysUtils;

public class HomeWork2_2_2 {

    public static void outputAllElements(int [] a){
        int i = 0;
        do{
            int element = a[i];
            System.out.print(element + "\t");
            i++;
        }while(i < a.length);
        System.out.println();

        int k = 0;
        while(k < a.length){
            int element = a[k];
            System.out.print(element + "\t");
            k++;
        }
        System.out.println();

        for (int j = 0; j < a.length; j++) {
            int element = a[j];
            System.out.print(element + "\t");
        }
        System.out.println();

        for (int y : a) {
            System.out.print(y + "\t");
        }
        System.out.println("\n");
    }

    public static void outputDifferentElements(int [] a) {
        int i = 1;
        do {
            int element = a[i];
            System.out.print(element + "\t");
            i += 2;
        } while (i < a.length);
        System.out.println();

        int k = 1;
        while (k < a.length) {
            int element = a[k];
            System.out.print(element + "\t");
            k += 2;
        }
        System.out.println();

        for (int j = 1; j < a.length; j += 2) {
            int element = a[j];
            System.out.print(element + "\t");
        }
        System.out.println();

        int g = 1;
        for (int y : a) {
            if (y == a[g]) {
                System.out.print(y + "\t");
                if (g < a.length-2){
                    g += 2;
                }
            }
        }
        System.out.println("\n");
    }

    public static void outputReversAllElements(int [] a){
        int i = a.length - 1;
        do{
            int element = a[i];
            System.out.print(element + "\t");
            i--;
        } while(i >= 0);
        System.out.println();

        int k = a.length - 1;
        while(k >= 0){
            int element = a[k];
            System.out.print(element + "\t");
            k--;
        }
        System.out.println();

        for (int j = a.length - 1; j >= 0; j--) {
            int element = a[j];
            System.out.print(element + "\t");
        }
        System.out.println();

        int g = a.length - 1;
        int [] temp = new int[a.length];
        for (int y : a) {
            temp[g] = y;
            g--;
        }
        for (int z : temp) {
            System.out.print(z + "\t");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int [] container = ArraysUtils.arrayFromConsole();
        outputAllElements(container);
        outputDifferentElements(container);
        outputReversAllElements(container);

    }
}