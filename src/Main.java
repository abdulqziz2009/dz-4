import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listA = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка A: ");
            String inputA = scanner.nextLine();
            listA.add(inputA);
        }

        System.out.println("Список A: " + listA);

        ArrayList<String> listB = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка B: ");
            String inputB = scanner.nextLine();
            listB.add(inputB);
        }

        System.out.println("Список B: " + listB);

        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        System.out.println("Список C: " + listC);

        Collections.sort(listC, Comparator.comparingInt(String::length));

        System.out.println("Отсортированный список C: " + listC);
    }
}