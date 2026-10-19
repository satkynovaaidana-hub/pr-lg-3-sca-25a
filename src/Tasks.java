import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long num = 1;
        while (n > 0) {
            long count = Math.min(num, n);

            for (long i = 0; i < count; i++) {
                System.out.print(num + " ");
            }
            n -= count;
            num++;
        }
    }
}