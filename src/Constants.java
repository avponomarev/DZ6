import java.util.Scanner;

public class Constants {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int X = 15;
        int Y = 25;
        int Z = 35;
        if (t == X || t == Y || t == Z) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }
    }
}
