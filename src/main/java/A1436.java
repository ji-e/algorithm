import java.util.Scanner;

public class A1436 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int cnt = 0;
        int start = 666;


        while(true){
            if(String.valueOf(start).contains("666")){
                cnt++;

                if(cnt==n){
                    System.out.println(start);
                    break;
                }
            }
            start++;
        }
    }
}
