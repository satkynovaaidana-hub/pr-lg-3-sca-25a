import java.util.Scanner;

public class Taskg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}