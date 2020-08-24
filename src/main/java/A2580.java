import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class A2580 {

    static int[][] result = new int[9][9];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                result[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sudoku(0, 0);

    }

    public static void sudoku(int x, int y) {

        if (y == 9) {
            sudoku(x + 1, 0);
            return;
        }

        if (x == 9) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(result[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.println(sb);

            System.exit(0);
        }


        if (result[x][y] == 0) {
            for (int i = 1; i <= 9; i++) {

                if (check(x, y, i)) {
                    result[x][y] = i;
                    sudoku(x, y + 1);
                }
            }
            result[x][y] = 0;
            return;
        }

        sudoku(x, y + 1);

    }

    public static boolean check(int x, int y, int k) {


        for (int i = 0; i < 9; i++) {
            if (result[x][i] == k) {
                return false;
            }
        }


        for (int i = 0; i < 9; i++) {
            if (result[i][y] == k) {
                return false;
            }
        }


        int set_row = (x / 3) * 3;
        int set_col = (y / 3) * 3;

        for (int i = set_row; i < set_row + 3; i++) {
            for (int j = set_col; j < set_col + 3; j++) {
                if (result[i][j] == k) {
                    return false;
                }
            }
        }

        return true;
    }

}