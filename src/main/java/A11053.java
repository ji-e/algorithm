import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A11053 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] result = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            result[i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j =1; j <= i; j++) {
                if (arr[i] > arr[j] && result[i] <= result[j]) {
                    result[i] = result[j] + 1;
                }
            }
        }

        Arrays.sort(result);
        bw.write(String.valueOf(result[n]));

        br.close();
        bw.close();

    }

}
