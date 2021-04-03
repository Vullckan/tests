package HomeWork1;

public class HomeWork1_7_release2 {

    public static void toBinaryString(int number) {
        String result = "";
        int bit = 128;
        while (bit > 0) {
            if ((bit & number) > 0) {
                System.out.print('1');
            } else {
                System.out.print('0');
            }
            bit = bit >> 1;
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        toBinaryString(42);
        toBinaryString(15);
        toBinaryString(-42);
        toBinaryString(-15);
    }
}