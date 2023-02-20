import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char symbol1 = 'G';
        char symbol2 = 'C';
        char symbol3 = 'V';

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество прошедших дней: ");
        int newDay;
        newDay = scanner.nextInt();

        for (int day = 1; day <= newDay; day++) {
            char temp = symbol2;
            symbol2 = symbol3;
            symbol3 = temp;

            char newTemp = symbol1;
            symbol1 = symbol2;
            symbol2 = newTemp;
        }
        System.out.println("Полученная таким образом последовательность: " + symbol1 + symbol2 + symbol3);
    }
}