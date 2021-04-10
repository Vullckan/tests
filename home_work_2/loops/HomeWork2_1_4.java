package loops;

import java.util.Random;

public class HomeWork2_1_4 {

    public static void getMultiply(int f) {
        long result = 1L;
        long preresult = 1L;
        String txt1, txt2;
        String txt3 = f + "";
        while(true) {
            result *= f;
            if (result / preresult != f){
                txt2 = result + "";
                break;
            }
            preresult = result;
        }
        txt1 = preresult + "";
        print(txt1, txt2, txt3);
    }

    public static void print(String a, String b, String c){
        System.out.println("Значение до переполнения при умножении на число " + c + ": " + a);
        System.out.println("Значение после переполнения при умножении на число " + c + ": " + b);
        System.out.println("");

    }

    public static void main(String[] args) {
        getMultiply(3);
        getMultiply(188);
        getMultiply(-19);
        Random various = new Random();
        int v = various.nextInt();
        getMultiply(v);
    }
}