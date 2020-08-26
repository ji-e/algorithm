import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A2579 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] step = new int[n + 2];
        int[] result = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            step[i] = Integer.parseInt(br.readLine());
        }

        result[1] = step[1];
        if (n > 1) {

            result[2] = step[2] + step[1];

            for (int i = 3; i <= n; i++) {
                result[i] = Math.max(result[i - 2], (result[i - 3] + step[i - 1])) + step[i];
            }

        }
        bw.write(String.valueOf(result[n]));

        br.close();
        bw.close();

    }

}
