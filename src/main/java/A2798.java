import java.util.Scanner;

public class A2798 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] cards = new int[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            cards[i] = scan.nextInt();
        }
        scan.close();

        for (int x = 0; x < n; x++) {
            for (int y = x + 1; y < n; y++) {
                for (int z = y + 1; z < n; z++) {
                    int sum = cards[x] + cards[y] + cards[z];
                    if (sum <= m) {
                        if (m - sum < Math.abs(m - result)) {
                            result = sum;
                        }

                    }
                }
            }
        }

        System.out.println(result);

    }
}
