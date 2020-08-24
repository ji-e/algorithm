import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class A1181 {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList<String> words = new ArrayList<String>();

        for(int i = 0;i<n;i++){
            words.add(scan.nextLine());
        }
        scan.close();
        Collections.sort(words);
        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length() , o2.length());
            }
        });

        String temp = words.get(0);
        StringBuffer sb = new StringBuffer();
        sb.append(temp+"\n");
        for(int i = 1;i<n;i++){

            if(temp.equals(words.get(i))){
                continue;
            }
            temp = words.get(i);
            sb.append(temp+"\n");
        }
        System.out.println(sb);
    }
}
