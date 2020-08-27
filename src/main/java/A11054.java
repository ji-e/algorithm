import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A11054 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] resultL = new int[n + 1];
        int[] resultR = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            resultL[i] = 1;
            resultR[i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (arr[i] > arr[j] && resultL[i] <= resultL[j]) {
                    resultL[i] = resultL[j] + 1;
                }
                if (arr[n - i + 1] > arr[n - j + 1] && resultR[n - i + 1] <= resultR[n - j + 1]) {
                    resultR[n - i + 1] = resultR[n - j + 1] + 1;
                }
            }
        }


        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = Math.max(resultL[i] + resultR[i], result);
        }
        bw.write(String.valueOf(result - 1));

        br.close();
        bw.close();

    }

}
