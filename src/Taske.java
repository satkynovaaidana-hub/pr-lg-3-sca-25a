import java.util.Scanner;

public class Taske {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.next();
        int sum = 0;
        for (int i = 0; i < x.length(); i++) {
            sum += x.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}