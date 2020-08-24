import java.util.Scanner;

/**
 * ok
 */
public class A2231 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int temp = 0;
        int div = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            div = i;
            temp = i;
            while (div > 0) {
                temp += div % 10;
                div /= 10;
            }

            if (temp == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
