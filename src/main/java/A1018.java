import java.util.Scanner;

/**
 * ok
 */
public class A1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String chess[][] = new String[n][m];
        String wb[][] = new String[2][8];
        String bw[][] = new String[2][8];
        wb[0] = "WBWBWBWB".split("");
        wb[1] = "BWBWBWBW".split("");
        bw[1] = "WBWBWBWB".split("");
        bw[0] = "BWBWBWBW".split("");


        for (int i = 0; i < n; i++) {
            String str = scan.next();
            for (int j = 0; j < m; j++) {
                chess[i][j] = String.valueOf(str.charAt(j));
            }
        }

        scan.close();
        int startX = 0;
        int startY = 0;
        int resultW = 0;
        int resultB = 0;
        int resultTemp = n * m;

        while ((startX <= n - 8) && (startY <= m - 8)) {

            for (int i = startX; i < startX + 8; i++) {
                for (int j = startY; j < startY + 8; j++) {
                    if (!chess[i][j].equals(wb[i % 2][j - startY])) resultW++;
                    if (!chess[i][j].equals(bw[i % 2][j - startY])) resultB++;
                }

            }

            resultTemp = Math.min(resultW, resultTemp);
            resultTemp = Math.min(resultB, resultTemp);

            resultW = resultB = 0;

            if (startY == m - 8) {
                startY = -1;
                startX++;
            }

            startY++;


        }
        System.out.println(resultTemp);

    }
}
