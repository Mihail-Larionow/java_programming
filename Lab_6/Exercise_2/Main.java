import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Date date = new Date();
        System.out.print("Введите год: ");
        date.setDate(in.nextInt());
        System.out.print("Введите месяц: ");
        date.setMonth(in.nextInt());
        System.out.print("Введите день: ");
        date.setDay(in.nextInt());
        System.out.println("displayMonth: " + date.displayMonth(date.getMonth()));
    }
}