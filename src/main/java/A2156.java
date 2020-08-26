import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A2156 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] wine = new int[n + 2];
        int[] result = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        result[1] = wine[1];
        if (n > 1) {
            result[2] = wine[2] + wine[1];
        }

        for (int i = 3; i <= n; i++) {
            result[i] = Math.max(Math.max(result[i - 1], result[i - 2] + wine[i]), (result[i - 3] + wine[i - 1]) + wine[i]);
        }

        bw.write(String.valueOf(result[n]));

        br.close();
        bw.close();

    }

}
