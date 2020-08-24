import java.util.Scanner;

/**
 *
 */
public class A2447 {
    private static String[][] stars;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        stars = new String[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                stars[i][j] = " ";
            }
        }

        star(0, 0, num);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                sb.append(stars[i][j]);
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static void star(int x, int y, int n) {
        if (n == 1) {
            stars[x][y] = "*";
            return;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                } else {
                    star(x + i * (n / 3), y + j * (n / 3), n / 3);
                }
            }
        }
    }

}
