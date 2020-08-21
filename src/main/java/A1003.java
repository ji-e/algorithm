import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A1003 {
    static long[][] arr;
    static int ns[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ns = new int[n];
        arr = new long[41][2];

        for (int i = 0; i < n; i++) {
            ns[i] = Integer.parseInt(br.readLine());
        }

        arr[0][0] = 1;
        arr[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = arr[i - 2][j] + arr[i - 1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            bw.write(arr[ns[i]][0] + " " + arr[ns[i]][1] + "\n");
        }

        br.close();
        bw.close();

    }

}
