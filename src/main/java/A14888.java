import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class A14888 {

    static int[] nums;
    static int[] operations;
    static int[] checks;
    static ArrayList<Integer> operationsList = new ArrayList<>();
    static int n;
    static ArrayList<Integer> resultList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        nums = new int[n];
        operations = new int[n];
        checks = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            int oper = Integer.parseInt(st.nextToken());
            for (int j = 0; j < oper; j++) {
                operationsList.add(i);
            }
        }

        operation(0);

        resultList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });

        System.out.println(resultList.get(resultList.size() - 1));
        System.out.println(resultList.get(0));

    }

    public static void operation(int v) {

        if (v == n - 1) {
            calculator();
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (checks[i] == 1) {
                continue;
            }
            checks[i] = 1;
            operations[v] = operationsList.get(i);
            operation(v + 1);
            checks[i] = 0;

        }


    }

    public static void calculator() {
        int result = nums[0];
        for (int i = 0; i < n - 1; i++) {
            if (operations[i] == 0) {
                result += nums[i + 1];
            } else if (operations[i] == 1) {
                result -= nums[i + 1];
            } else if (operations[i] == 2) {
                result *= nums[i + 1];
            } else if (operations[i] == 3) {
                result /= nums[i + 1];
            }
        }

        resultList.add(result);
    }

}