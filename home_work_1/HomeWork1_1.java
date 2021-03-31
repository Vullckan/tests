package HomeWork1;

import java.util.ArrayList;

public class HomeWork1_1 {
    static String txt1;
    static String txt2;

    public static int setNOT(int c){
        txt1 = "побитовый унарный оператор NOT\":\t\t\t\t\t\t";
        txt2 = "~ " + c + " = ";
        return ~ c;
    }

    public static int doAND(int c, int d){
        txt1 = "побитовый AND\":\t\t\t\t\t\t\t\t \t \t ";
        txt2 = c + " & " + d + " = ";
        return c & d;
    }

    public static int doANDSet(int c, int d){
        txt1 = "побитовый AND с присваиванием\":\t\t\t\t\t\t";
        txt2 = c + " &= " + d + "   ";
        c &= d;
        return c;
    }

    public static int doOR(int c, int d){
        txt1 = "побитовый OR\":\t\t\t\t\t\t\t\t \t \t ";
        txt2 = c + " | " + d + " = ";
        return c | d;
    }

    public static int doORSet(int c, int d){
        txt1 = "побитовый OR с присваиванием\":\t\t\t\t\t\t";
        txt2 = c + " |= " + d + "   ";
        c |= d;
        return c;
    }

    public static int doExclusiveOR(int c, int d){
        txt1 = "побитовый исключающее OR\":\t\t\t\t\t\t\t ";
        txt2 = c + " ^ " + d + " = ";
        return c ^ d;
    }

    public static int doExclusiveORSet(int c, int d){
        txt1 = "побитовый исключающее OR с присваиванием\":\t\t\t";
        txt2 = c + " ^= " + d + "   ";
        c ^= d;
        return c;
    }

    public static int setShiftRight(int c){
        txt1 = "сдвиг вправо\":\t\t\t\t\t\t\t\t\t\t ";
        txt2 = c + " >> 2 = ";
        c = c >> 2;
        return c;
    }

    public static int setShiftRightSet(int c){
        txt1 = "сдвиг вправо с присваиванием\":\t\t\t\t\t\t";
        txt2 = c + " >>= 2   ";
        return c >>= 2;
    }

    public static int setShiftRightFillZero(int c){
        txt1 = "сдвиг вправо с заполнением нулями\":\t\t\t\t\t";
        txt2 = c + " >>> 2 = ";
        c = c >>> 2;
        return c;
    }

    public static int setShiftLeft(int c){
        txt1 = "сдвиг влево\":\t\t\t\t\t\t\t\t\t\t ";
        txt2 = c + " << 2 = ";
        c = c << 2;
        return c;
    }

    public static int setShiftLeftSet(int c){
        txt1 = "сдвиг влево с присваиванием\":\t\t\t\t\t\t";
        txt2 = c + " <<= 2   ";
        return c <<= 2;
    }

    public static int setShiftRightFillZeroSet(int c){
        txt1 = "сдвиг вправо с заполнением нулями с присваиванием\": ";
        return c >>>= 2;
    }

    public static void print(int k){
        System.out.print("Результат операции \"" + txt1 + txt2 + k);
    }


    public static void start(int a, int b) {

        String txtA = Integer.toBinaryString(a);
        String txtB = Integer.toBinaryString(b);

        System.out.println("\t\t\t\tЦелочисленное число " + a + ";\t// двоичный код числа\t" + txtA);
        System.out.println("\t\t\t\tЦелочисленное число " + b + ";\t// двоичный код числа\t" + txtB);

        String txt3 = "\t\t\t// двоичный код результата\t";

        int result1 = setNOT(a);
        print(result1);
        System.out.println(txt3 + Integer.toBinaryString(result1));
        int result2 = setNOT(b);
        print(result2);
        System.out.println(txt3 + Integer.toBinaryString(result2));
        int result3 = doAND(a, b);
        print(result3);
        System.out.println(txt3 + Integer.toBinaryString(result3));
        int result4 = doANDSet(a, b);
        print(result4);
        System.out.println(txt3 + Integer.toBinaryString(result4));
        int result5 = doOR(a, b);
        print(result5);
        System.out.println(txt3 + Integer.toBinaryString(result5));
        int result6 = doORSet(a, b);
        print(result6);
        System.out.println(txt3 + Integer.toBinaryString(result6));
        int result7 = doExclusiveOR(a, b);
        print(result7);
        System.out.println(txt3 + Integer.toBinaryString(result7));
        int result8 = doExclusiveORSet(a, b);
        print(result8);
        System.out.println(txt3 + Integer.toBinaryString(result8));
        int result9 = setShiftRight(a);
        print(result9);
        System.out.println(txt3 + Integer.toBinaryString(result9));
        int result10 = setShiftRight(b);
        print(result10);
        System.out.println(txt3 + Integer.toBinaryString(result10));
        int result11 = setShiftRightSet(a);
        print(result11);
        System.out.println(txt3 + Integer.toBinaryString(result11));
        int result12 = setShiftRightSet(b);
        print(result12);
        System.out.println(txt3 + Integer.toBinaryString(result12));
        int result13 = setShiftRightFillZero(a);
        print(result13);
        System.out.println(txt3 + Integer.toBinaryString(result13));
        int result14 = setShiftRightFillZero(b);
        print(result14);
        System.out.println(txt3 + Integer.toBinaryString(result14));
        int result15 = setShiftLeft(a);
        print(result15);
        System.out.println(txt3 + Integer.toBinaryString(result15));
        int result16 = setShiftLeft(b);
        print(result16);
        System.out.println(txt3 + Integer.toBinaryString(result16));
        int result17 = setShiftLeftSet(a);
        print(result17);
        System.out.println(txt3 + Integer.toBinaryString(result17));
        int result18 = setShiftLeftSet(b);
        print(result18);
        System.out.println(txt3 + Integer.toBinaryString(result18));
        int result19 = setShiftRightFillZeroSet(a);
        print(result19);
        System.out.println(txt3 + Integer.toBinaryString(result19));
        int result20 = setShiftRightFillZeroSet(b);
        print(result20);
        System.out.println(txt3 + Integer.toBinaryString(result20));
        System.out.println("");
    }

    public static void main(String[] args) {
        start(42, 15);
        start(-42, -15);

    //    long result = ~ 42.5; // Operator '~' cannot be applied to 'double'

    }
}
