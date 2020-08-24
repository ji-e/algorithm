import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class A9461 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int nums[] = new int[n];

        long arr[] = new long[102];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;

        for (int i = 4; i < 101; i++) {
            arr[i] = arr[i - 3] + arr[i - 2];
        }

        for (int i = 0; i < n; i++) {
            bw.write(arr[nums[i]] + "\n");
        }

        br.close();
        bw.close();

    }

}
