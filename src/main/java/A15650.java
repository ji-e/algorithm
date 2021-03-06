import java.util.Scanner;

public class A15650 {
    static int[] num;
    static int[] check;
    static int n, m;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();

        num = new int[9];
        check = new int[9];

        dfs(0,0);
        scan.close();

    }

    public static void dfs(int l, int k) {
        if (k == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = l+1; i <= n; i++) {
            if (check[i] == 1) {
                continue;
            }
            check[i] = 1;
            num[k] = i;
            dfs(i,k + 1);
            check[i] = 0;

        }

    }
}
