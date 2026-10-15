import java.util.Scanner;

public class Taskh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
