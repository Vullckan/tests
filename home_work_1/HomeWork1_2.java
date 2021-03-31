package HomeWork2;

public class HomeWork1_2 {
    static int a;
    static int b;
    static int result;

    public static int task1() {
        a = 2;
        b = 8;
        result = 5 + a / b;                          // выражение result = 5 + 0
        System.out.println(result);
        return result;
    }

    public static int task2() {
        a = 2;
        b = 8;
        result = (5 + a) / b;                         // выражение result = 7 / 8
        System.out.println(result);
        return result;
    }

    public static int task3() {
        a = 2;
        b = 8;
        result = (5 + a++) / b;                       // выражение result = 7 / 8
        System.out.println(result);
        return result;
    }

    public static int task4() {
        a = 2;
        b = 8;
        result = (5 + a++) / --b;                      // выражение result = 7 / 7
        System.out.println(result);
        return result;
    }

    public static int task5() {
        a = 2;
        b = 8;
        result = (5 * a >> a++) / --b;                 // выражение result = (10 >> 2) / 7 = 2 / 7
        System.out.println(result);
        return result;
    }

    public static int task6(){
        a = 2;
        b = 8;
        result = (5 + 7 > 20 ? 68 : 22 * a >> a++) / --b;   // выражение вида result = (44 >> 2) / 7 = 11 / 7
        System.out.println(result);
        return result;
    }

    public static int task7(){
      a = 2;
      b = 8;
    //  result = (5 + 7 > 20 ? 68 >= 68 : 22 * a >> a++) / --b;   // некоректный ввод выражения: невозможно деление boolean / int
      System.out.println("некоректный ввод выражения: невозможно деление boolean / int (одно из возможных вариантов ветвления тернарного оператора)");
      return result;
    }

    public static boolean task8(){
        a = 2;
        b = 8;
        boolean result1 = 6 - a > 3 && 12 * 12 <= 119;      // выражение вида result1 = true && false
        System.out.println(result1);
        return result1;
    }

    public static boolean task9(){
        boolean result1 = true && false;
        System.out.println(result1);
        return result1;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }
}
