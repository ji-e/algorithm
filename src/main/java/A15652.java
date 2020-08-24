import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class A15652 {
    static int[] num;
    static int[] check;
    static int n, m;
    static BufferedWriter bw;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();

        num = new int[9];
        check = new int[9];
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        dfs(0, 0);

        scan.close();
        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void dfs(int l, int k) {
        if (k == m) {
            try {
                for (int i = 0; i < m; i++) {
                    bw.write(num[i] + " ");
                }
                bw.write("\n");

            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        for (int i = l+1; i <= n; i++) {
            num[k] = i;
            dfs(i-1, k + 1);
        }
    }
}
