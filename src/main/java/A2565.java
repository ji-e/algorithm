import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class A2565 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<X_Y> arrayList = new ArrayList<X_Y>();
        int[] result = new int[n + 1];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arrayList.add(new X_Y(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            result[i] = 1;
        }

        arrayList.sort(new Comparator<X_Y>() {
            @Override
            public int compare(X_Y o1, X_Y o2) {
                return Integer.compare(o1.x, o2.x);
            }
        });


        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arrayList.get(i).y > arrayList.get(j).y && result[i] <= result[j]) {
                    result[i] = result[j] + 1;
                }

            }
        }


        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(result[i], max);
        }
        bw.write(String.valueOf(n - max));

        br.close();
        bw.close();

    }

    static class X_Y {
        int x;
        int y;

        public X_Y(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
