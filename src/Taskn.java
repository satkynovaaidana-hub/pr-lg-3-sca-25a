import java.util.Scanner;

public class Taska {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int z = 0;
        int p = 0;
        int n = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (num == 0) {
                z++;
            } else if (num > 0) {
                p++;
            } else {
                n++;
            }
        }
        System.out.print(z + " " + p + " " + n);
    }
}