import java.util.Scanner;

public class Taskp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();

        for (long x = 0; x <= 1000; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                System.out.print(x + " ");
            }
        }
    }
}