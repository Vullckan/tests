package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class HomeWork1_5_2 {
    public static void main(String[] args) {
        System.out.println("��� ��� �����?");
        Scanner input = new Scanner(System.in);
        String line =input.nextLine();
        String text1 = "����";
        String text2 = "���������";
        String answer = "� ���� ��� ����� ����";
        if (Objects.equals(line, text1)){
            System.out.println("������!");
            System.out.println(answer);
        }
        else if (Objects.equals(line, text2))
            System.out.println(answer);
        else if (!Objects.equals(line, text1) && !Objects.equals(line, text2))
            System.out.println("������ ����, � �� ���?");
    }
}
