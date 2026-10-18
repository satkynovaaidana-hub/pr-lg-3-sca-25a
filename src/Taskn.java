import java.util.Scanner;

public class Taskn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int zeros = 0;
        int positives = 0;
        int negatives = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (num == 0) {
                zeros++;
            } else if (num > 0) {
                positives++;
            } else {
                negatives++;
            }
        }

        System.out.print(zeros + " " + positives + " " + negatives);
    }
}