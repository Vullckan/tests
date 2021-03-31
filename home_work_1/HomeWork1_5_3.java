package HomeWork1;

import java.util.Scanner;

public class HomeWork1_5_3 {
    public static void main(String[] args) {
        System.out.println("Как вас зовут?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String answer = "Я тебя так долго ждал";
        switch (name) {
            case "Вася" : {
                System.out.println("Привет!");
                System.out.println(answer);
                break;
            }
            case "Анастасия" : {
                System.out.println(answer);
                break;
            }
            default :
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
