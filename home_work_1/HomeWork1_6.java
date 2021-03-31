package HomeWork1;

public class HomeWork1_6 {
    public static String createPhoneNumber(int[] numbers) {
        String text = "";
        for (int i = 0; i < numbers.length; i++) {
            text += numbers[i];
        }
        String textReform = "(" + text.charAt(0) + text.charAt(1) + text.charAt(2) + ") ";
        textReform += "" + text.charAt(3) + text.charAt(4) + text.charAt(5) + "-";
        textReform += "" + text.charAt(6) + text.charAt(7) + text.charAt(8) + text.charAt(9);
        return textReform;
    }

    public static void main(String[] args) {
        String phone = createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0});
        System.out.println(phone);

    }
}
