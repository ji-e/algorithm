
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class A11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<X_Y> arrayList = new ArrayList<X_Y>(n);

        for (int i = 0; i < n; i++) {
            arrayList.add(new X_Y(sc.nextInt(), sc.nextInt()));
        }

        arrayList.sort(new Comparator<X_Y>() {
            @Override
            public int compare(X_Y xy1, X_Y xy2) {
                if (xy1.y == xy2.y) {
                    return Integer.compare(xy1.x,  xy2.x);
                }
                return Integer.compare(xy1.y,  xy2.y);
            }
        });



        for (X_Y a : arrayList) {
            System.out.println(a.x + " " + a.y);
        }

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
