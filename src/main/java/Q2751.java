import java.util.Scanner;

/**
 * hip sort
 * fail
 */
public class Q2751 {
    static int n;
    static int[] array;
    static int[] result;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        array = new int[n + 1];
        result = new int[n];

        for (int i = 1; i <= n; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();


        int y = n;
        int x = 0;
        while (x < n) {
            sort(y--);
            result[x] = array[1];
            array[1] = array[y+1];
            x++;
        }



        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(result[i] + "\n");
        }
        System.out.println(sb);

    }

    public static void sort(int y) {
        int index = y;
        int k = 1;

        while (index > 1) {

            if (array[index] < array[index / 2]) {
                int temp = array[index / 2];
                array[index / 2] = array[index];
                array[index] = temp;
            }

            index = index / 2;

            if (index == 1) {
                index = y;
                if (array[index] > array[index / 2]) {
                    index = y - k++;
                }
            }
        }
    }

}
