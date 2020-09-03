import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class A9251 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int dp[][] = new int[1001][1001];

        for (int i = 1; i <= str1.length(); i++) {
            char ch1 = str1.charAt(i - 1);
            for (int j = 1; j <= str2.length(); j++) {
                char ch2 = str2.charAt(j - 1);

                if (ch1 == ch2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }


        bw.write(String.valueOf(dp[str1.length()][str2.length()]));

        br.close();
        bw.close();

    }


}
