import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class A10814 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<People> people = new ArrayList<People>();

        for (int i = 0; i < n; i++) {
            int age = scan.nextInt();
            String name = scan.nextLine();
            people.add(new People(i, age, name));
        }

        people.sort(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                if (o1.age == o2.age) {
                    return Integer.compare(o1.no, o2.no);
                }
                return Integer.compare(o1.age, o2.age);
            }
        });

        for (People a : people) {
            System.out.println(a.age + a.name);
        }
        scan.close();
    }

    public static class People {
        int no;
        int age;
        String name;

        public People(int no, int age, String name) {
            this.no = no;
            this.age = age;
            this.name = name;
        }
    }
}
