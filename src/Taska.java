import java.util.Scanner;

public class Taska {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a % 2 != 0) {
            a++;
        }

        for (int i = a; i <= b; i += 2) {
            System.out.print(i + " ");
        }
    }
}