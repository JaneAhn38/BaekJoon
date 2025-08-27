import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public  class num2884 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M >= 45) {
            M -= 45;
        } else {
            M += 15; // M += 60 - 45 (1시간 빌려오기)
            H -= 1; // 빌려온 1시간 빼주기
            if (H < 0) H = 23; // 근데 이때 빼 준 결과값이 음수가 될 경우
        }
        System.out.println(H + " " + M);
    }
}