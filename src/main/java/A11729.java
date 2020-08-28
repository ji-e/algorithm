import java.util.Scanner;

/**
 * ok
 */
public class A11729 {
    static StringBuilder sb;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        sb = new StringBuilder();

//        h(num, 1, 2, 3);
        h(num, 1, 3);

        sb.insert(0, cnt + "\n");
        System.out.println(sb);

    }

    public static void h(int n, int x, int z) {
        if (n == 1) {
            sb.append(x + " " + z + "\n");
        } else {
            h(n - 1, x, 6 - x - z);
            sb.append(x + " " + z + "\n");
            h(n - 1, 6 - x - z, z);
        }
        cnt++;
    }

    public static void h(int n, int x, int y, int z) {
        if (n == 1) {
            sb.append(x + " " + z + "\n");
        } else {
            h(n - 1, x, z, y);
            sb.append(x + " " + z + "\n");
            h(n - 1, y, x, z);
        }
        cnt++;
    }
}
