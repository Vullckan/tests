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
            System.out.println("Можем спать дальше");
        else System.out.println("Нужно вставать на работу");
        return result;
    }

    public static void main(String[] args) {
        // sleepIn(false, false);                           // У нас выходной. Можем спать дальше
        sleepIn(true,  false);
        // sleepIn(false, true);                            // У нас отпуск. Можем спать дальше

    }
}
