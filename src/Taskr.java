import java.util.Scanner;

public class Taskr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (!in.hasNextInt()) return;
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        int count = 0;

        for (int x = 0; x <= 1000; x++) {
            if (x == e) {
                continue;
            }
            long n = (long) a * x * x * x + (long) b * x * x + (long) c * x + d;

            if (n == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
