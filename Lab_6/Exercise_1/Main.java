import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int a = in.nextInt();
            a = (a << 1) + (a << 3);
            System.out.println(a);
        }
    }

}