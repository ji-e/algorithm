import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A1463 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] result = new int[4];
        int[] oper = new int[n + 3];

        oper[1] = 0;
        oper[2] = 1;
        oper[3] = 1;


        for (int i = 4; i <= n; i++) {
            if (i % 3 == 0) {
                result[3] = oper[i / 3] + 1;
            } else {
                result[3] = n;
            }

            if (i % 2 == 0) {
                result[2] = oper[i / 2] + 1;
            } else {
                result[2] = n;
            }

            result[1] = oper[i - 1] + 1;
            oper[i] = Math.min(result[3], Math.min(result[2], result[1]));

            result[1] = 0;
            result[2] = 0;
            result[3] = 0;
        }


        bw.write(String.valueOf(oper[n]));

        br.close();
        bw.close();

    }

}
