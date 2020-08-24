import java.util.Scanner;

/**
 * ok
 */
public class A10870 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        int result = p(num);
        System.out.println(result);
    }

    public static int p(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return p(n - 1) + p(n - 2);
    }
}
