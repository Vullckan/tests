package HomeWork1;

public class HomeWork1_3 {
    static double result;

    public static double cosinus(double k){                 // косинус угла в радианах
        result = Math.cos(k);
        System.out.println(result);
        return result;
    }

    public static double sinus(double k){                   // синус угла в радианах
        result = Math.sin(k);
        System.out.println(result);
        return result;
    }

    public static double tangens(double k){                 // тангенс угла в радианах
        result = Math.tan(k);
        System.out.println(result);
        return result;
    }

    public static double cotangens(double k){                 // котангенс угла в радианах
        result = 1 / Math.tan(k);
        System.out.println(result);
        return result;
    }

    public static double pow(double k){                     // корень третьей степени числа
        result = Math.pow(k, (double)1 / 3);
        System.out.println(result);
        return result;
    }

    public static double sqrt(double k){                    // квадратный корень числа
        result = Math.sqrt(k);
        System.out.println(result);
        return result;
    }

    public static double max(double k, double l){             // определение максимального числа из двух сравниваемых чисел
        result = Math.max(k, l);
        System.out.println(result);
        return result;
    }

    public static double exp(double k){                     // вычисление функции e в степени x
        result = Math.exp(k);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        cosinus(Math.PI);
        sinus(Math.PI);
        tangens(Math.PI);
        cotangens(Math.PI / 4);
        pow(27);
        sqrt(9);
        max(10,100);
        exp(0);
    }
}
