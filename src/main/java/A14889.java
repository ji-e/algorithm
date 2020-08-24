import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A14889 {

    static int[][] memberAbility;
    static int[] team;
    static int[] teamAbility;
    static int[] checks;
    static int[] teamAbilityChecks;
    static int n;
    static int m;
    static ArrayList<Integer> result = new ArrayList<>();
    static ArrayList<Integer> sumList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = n / 2;
        team = new int[m + 1];
        teamAbility = new int[m + 1];
        memberAbility = new int[n + 1][n + 1];
        checks = new int[n + 1];
        teamAbilityChecks = new int[m + 1];


        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= n; j++) {
                int mem = Integer.parseInt(st.nextToken());
                memberAbility[i][j] = mem;
            }
        }

        setTeam(0, 0);

        int re = Math.abs(result.get(0) - result.get(result.size() - 1));
        for (int i = 1; i < result.size() / 2; i++) {
            int temp = Math.abs(result.get(i) - result.get(result.size() - i - 1));
            if (re > temp)
                re = temp;
        }
        System.out.println(re);

        for (int i = 0; i < m; i++) {

        }
    }

    public static void setTeam(int l, int k) {

        if (k == m) {

            setTeamAbility(0, 0);
            int sum = 0;
            for (int i : sumList) {
                sum += i;
            }
            result.add(sum);
            sumList.clear();
            return;
        }

        for (int i = l + 1; i <= n; i++) {
            if (checks[i] == 1) {
                continue;
            }

            checks[i] = 1;
            team[k] = i;
            setTeam(i, k + 1);
            checks[i] = 0;

        }


    }


    public static void setTeamAbility(int l, int k) {

        if (k == 2) {
            sumList.add(memberAbility[teamAbility[0]][teamAbility[1]] + memberAbility[teamAbility[1]][teamAbility[0]]);
            return;
        }

        for (int i = l + 1; i <= m; i++) {
            if (teamAbilityChecks[i] == 1) {
                continue;
            }

            teamAbilityChecks[i] = 1;
            teamAbility[k] = team[i - 1];
            setTeamAbility(i, k + 1);
            teamAbilityChecks[i] = 0;

        }

    }

}