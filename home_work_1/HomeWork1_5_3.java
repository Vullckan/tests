package HomeWork1;

import java.util.Scanner;

public class HomeWork1_5_3 {
    public static void main(String[] args) {
        System.out.println("��� ��� �����?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String answer = "� ���� ��� ����� ����";
        switch (name) {
            case "����" : {
                System.out.println("������!");
                System.out.println(answer);
                break;
            }
            case "���������" : {
                System.out.println(answer);
                break;
            }
            default :
                System.out.println("������ ����, � �� ���?");
        }
    }
}
