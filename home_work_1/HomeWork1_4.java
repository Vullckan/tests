package HomeWork1;

public class HomeWork1_4 {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean result = false;
        if (weekday == false && vacation == false)
            result = true;
        if (weekday == true && vacation == false)
            result = false;
        if (weekday == false && vacation == true)
            result = true;
        if (result == true)
            System.out.println("����� ����� ������");
        else System.out.println("����� �������� �� ������");
        return result;
    }

    public static void main(String[] args) {
        // sleepIn(false, false);                           // � ��� ��������. ����� ����� ������
        sleepIn(true,  false);
        // sleepIn(false, true);                            // � ��� ������. ����� ����� ������

    }
}
