package loops;

public class HomeWork2_1_5 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t  Т А Б Л И Ц А");
        System.out.println("\t\t\t\t    У М Н О Ж Е Н И Я");
        System.out.println("");
        int result = 1;
        for (int i = 1; i < 11 ; i++) {
            for (int j = 2; j < 6; j++) {
                result = i * j;
                String txt1 = "" + j + " x " + i + " = ";
                txt1 += result;
                txt1 += "\t\t";
                System.out.print(txt1);
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i < 11 ; i++) {
            for (int j = 6; j < 10; j++) {
                result = i * j;
                String txt1 = "" + j + " x " + i + " = ";
                txt1 += result;
                txt1 += "\t\t";
                System.out.print(txt1);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("\tЭ Т О");
        System.out.println("\tН У Ж Н О");
        System.out.println("\tЗ Н А Т Ь !");
    }
}
