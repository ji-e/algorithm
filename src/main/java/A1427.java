import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * ok
 */
public class A1427 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String n = br.readLine();
            String[] array = n.split("");

            Arrays.sort(array);

            for (int i = array.length - 1; i >= 0; i--) {
                bw.write(array[i]);
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
