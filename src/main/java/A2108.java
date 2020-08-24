import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * ok
 */
public class A2108 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());
            int[] array = new int[n];
            int[] sortArray = new int[n];

            for (int i = 0; i < n; i++) {
                int v = Integer.parseInt(br.readLine());
                array[i] = v;
                sortArray[i] = v;
            }

            Arrays.sort(sortArray);

            bw.write(Average(n, array) + "\n");
            bw.write(Middle(n, sortArray) + "\n");
            bw.write(Frequency(n, array) + "\n");
            bw.write(Range(n, sortArray) + "\n");

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String Average(int n, int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;

        }
        return String.valueOf((int) Math.round((double) sum / (double) n));
    }

    public static String Middle(int n, int[] array) {
        return String.valueOf(array[n / 2]);
    }

    public static String Frequency(int n, int[] array) {
        int arr[] = new int[8001];
        for (int i = 0; i < n; i++) {
            arr[array[i] + 4000]++;
        }
        int max = 0;
        int x = 0;
        int index[] = new int[2];
        for (int i = 0; i < 8001; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < 8001; i++) {
            if (arr[i] == max) {
                index[x++] = i - 4000;
            }
            if (x == 2) {
                break;
            }

        }
        return String.valueOf(index[x - 1]);
    }

    public static String Range(int n, int[] array) {
        return String.valueOf(array[n - 1] - array[0]);
    }

}
