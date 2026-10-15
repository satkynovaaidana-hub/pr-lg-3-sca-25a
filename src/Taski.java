import java.util.Scanner;

public class Taski {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();

        long count = 0;
        for (long i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                if (i * i == x) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }

        System.out.print(count);
    }
}
