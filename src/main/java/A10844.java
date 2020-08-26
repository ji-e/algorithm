import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A10844 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[][] arr = new long[n + 1][11];

        for (int i = 1; i < 10; i++) {
            arr[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            arr[i][0] = arr[i - 1][1] % 1000000000;
            arr[i][9] = arr[i - 1][8] % 1000000000;
            for (int j = 1; j < 9; j++) {
                arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j + 1]) % 1000000000;
            }
        }

        long result = 0;
        for (int i = 0; i <= 9; i++) {
            result += arr[n][i];
        }
        bw.write(String.valueOf(result % 1000000000));

        br.close();
        bw.close();

    }

}
