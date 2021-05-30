package HomeWork5;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T>{
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item){
        int element = 0;
        if(item == null){
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if(data[data.length - 1] != null){
                data = Arrays.copyOf(data, data.length + 1);
                data[data.length - 1] = item;
                element = data.length - 1;
                break;
            }
            if (data[i] == null) {
                data[i] = item;
                element = i;
                break;
            }
        }
        return element;
    }

    public T get(int index) {
        if(index < data.length)
            return data[index];
        else
            return null;
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete (int index){
        if(index < data.length - 1){
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        }
        if(index == data.length - 1){
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        }
        else
            return false;
    }

    public boolean delete (T item){
        boolean variant = false;
        for (int i = 0; i < data.length; i++) {
            if(item.equals(data[i])) {
                for (int j = i; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                }
                    data = Arrays.copyOf(data, data.length - 1);
                    variant = true;
            }
            if (item.equals(data[data.length - 1])) {
                data = Arrays.copyOf(data, data.length - 1);
                variant = true;
            }
        }
        return variant;
    }

    public void sort(Comparator<T> comparator){

    }

    @Override
    public String toString() {
/*        T[] result = data.clone();
        for (int i = 0; i < result.length - 1; i++) {
            if (result[i] == null) {
                for (int j = i; j < data.length - 1; j++) {
                    result[i] = result[i + 1];
                    result = Arrays.copyOf(result, result.length - 1);
                }
            }
        }
        if (result[result.length - 1] == null) {
           result = Arrays.copyOf(result, result.length - 1);
        }
*/        return "data = " + Arrays.toString(data);
    }

    public static void main(String[] args) {
        Integer inums[] = {1, null, 22, null, null, null, null, null};
        DataContainer<Integer> mass = new DataContainer<>(inums);
        System.out.println(mass.add(4));
        System.out.println(mass.add(2));
        System.out.println(mass.add(2));

        System.out.println(mass.add(8));

        System.out.println(mass);
        System.out.println(mass.get(8));
        System.out.println(mass.delete(10));
        System.out.println(mass);
        System.out.println(mass.delete(Integer.valueOf(5)));
        System.out.println(mass);

        }
    }
