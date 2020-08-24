import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ok
 */
public class A10989 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int  n = Integer.parseInt(br.readLine());
            int[] array = new int[10001];

            for (int i = 0; i < n; i++) {
                array[Integer.parseInt(br.readLine())]++;
            }

            for (int i = 0; i < 10001; i++) {
                for (int j = 0; j <array[i]; j++) {
                    bw.write(i + "\n");
                }
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
