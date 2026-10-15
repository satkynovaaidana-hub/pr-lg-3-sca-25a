import java.util.Scanner;

public class Taskj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            sum += in.nextLong();
        }

        System.out.print(sum);
    }
}