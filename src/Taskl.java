import java.util.Scanner;

public class Taskl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();

        int d = 0;
        int s = 1;

        while (b > 0) {
            int lastDigit = b % 10;
            d += lastDigit * s;
            s *= 2;
            b /= 10;
        }

        System.out.println(d);
    }
}