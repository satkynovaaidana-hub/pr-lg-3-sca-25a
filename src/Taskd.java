import java.util.Scanner;

public class Taskd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int d = in.nextInt();

        int count = 0;
        if (x == 0) {
            if (d == 0) {
                count = 1;
            }
        } else {
            while (x > 0) {
                if (x % 10 == d) {
                    count++;
                }
                x /= 10;
            }
        }

        System.out.println(count);
    }
}