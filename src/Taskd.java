import java.util.Scanner;

public class Taskd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.next();
        String d = in.next();

        System.out.println(x.length() - x.replace(d, "").length());
    }
}