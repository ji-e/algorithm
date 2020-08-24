import java.util.Scanner;

public class A7568 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }
        scan.close();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (x[i] < x[j] && y[i] < y[j]) {
                    result[i]++;
                }
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + 1 + " ");
        }
    }
}
