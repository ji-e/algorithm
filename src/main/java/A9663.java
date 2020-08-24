import java.util.Scanner;

/**
 * 공부필요
 */
public class A9663 {
    static int[] chess;
    static int n;
    static int cnt = 0;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            chess = new int[n];
            chess[0] = i;
            dfs(i, 0);
        }

        scan.close();
        System.out.println(cnt);
    }

    public static void dfs(int x, int y) {
        for (int i = 0; i < y; i++) {
            if (chess[i] == x || Math.abs(x - chess[i]) == y - i) {
                return;
            }
        }
        if (y == n - 1) {
            cnt++;
            return;
        }
        for (int i = 0; i < n; i++) {
            chess[y + 1] = i;
            dfs(i, y + 1);
        }
    }

}
