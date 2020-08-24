import java.util.Scanner;

/**
 * ok
 */
public class A10872 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        int result = pact(num);
        System.out.println(result);
    }

    public static int pact(int n) {
        if (n <= 1) return 1;
        return n * pact(n - 1);
    }

}
