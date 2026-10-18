import java.util.Scanner;

public class Tasko {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean h = false;

        for (int i = 0; i < n; i++) {
            if (in.nextInt() == 0) {
                h = true;
            }
        }

        if (h) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}