import java.util.ArrayList;
import java.util.Scanner;

/**
 * ok
 */
public class A2750 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();

        }

        /*scan.close();

        Arrays.sort(array);

        StringBuilder sb = new StringBuilder();

        for (int ar : array) {
            sb.append(ar+"\n");
        }
        System.out.println(sb);*/

        for (int i = 0; i < n; i++) {
            int tm;
            for (int j = 1; j < n; j++) {
                if (array[j] < array[j - 1]) {
                    tm = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tm;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int ard : array) {
            sb.append(ard + "\n");
        }
        System.out.println(sb);

    }
}
