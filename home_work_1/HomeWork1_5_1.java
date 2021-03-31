package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class HomeWork1_5_1 {
    public static void main(String[] args) {
        System.out.println("Как вас зовут?");
        Scanner input = new Scanner(System.in);
        String line =input.nextLine();
        String text1 = "Вася";
        String text2 = "Анастасия";
        String answer = "Я тебя так долго ждал";
        if (Objects.equals(line, text1)){
            System.out.println("Привет!");
            System.out.println(answer);
        }
        if (Objects.equals(line, text2))
            System.out.println(answer);
        if (!Objects.equals(line, text1) && !Objects.equals(line, text2))
            System.out.println("Добрый день, а вы кто?");
    }
}
