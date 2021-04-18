package utils;
public class SortUtils {
    public static int[] bubbleSort(int[] array) {
        array = array.clone();
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    public static int[] shakerSort(int[] array) {
        array = array.clone();
        int left = 1, right = array.length - 1;
        do {
            for (int i = right; i >= left; i--) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            left++;
            for (int i = left; i <= right; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            right--;
        } while (left <= right) ;
        return array;
    }
}
