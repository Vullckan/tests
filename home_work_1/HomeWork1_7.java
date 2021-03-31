package HomeWork1;

public class HomeWork1_7 {

    public static String toBinaryString(byte number) {
        String txt = "";
        String result = "";
        int elements = number;
        byte oneOrZero;
        if (elements >= 0) {
            while (true) {
                oneOrZero = (byte) (elements % 2);
                txt += oneOrZero;
                if (elements / 2 == 0)
                    break;
                elements /= 2;
            }
            result += 0;
            if (number <= 64)
                result += 0;
            if (number <= 32)
                result += 0;
            if (number <= 16)
                result += 0;
            if (number <= 8)
                result += 0;
            for (int i = txt.length() - 1; i >= 0; i--) {
                result += "" + txt.charAt(i);
            }
        } else {
            elements = (byte) (Math.abs(number) - 1);
            while (true) {
                oneOrZero = (byte) (elements % 2);
                if (oneOrZero == 0)
                    oneOrZero = 1;
                else oneOrZero = 0;
                txt += oneOrZero;
                if (elements / 2 == 0)
                    break;
                elements /= 2;
            }
            result += 1;
            if (number >= -64)
                result += 1;
            if (number >= -32)
                result += 1;
            if (number >= -16)
                result += 1;
            if (number >= -8)
                result += 1;
            for (int i = txt.length() - 1; i >= 0; i--) {
                result += "" + txt.charAt(i);
            }
        }
        return result;
    }

        public static void main (String[] args){
            System.out.println(toBinaryString((byte) 42));
            System.out.println(toBinaryString((byte) 15));
            System.out.println(toBinaryString((byte) -42));
            System.out.println(toBinaryString((byte) -15));

        }
    }
