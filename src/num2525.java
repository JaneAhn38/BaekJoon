import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class num2525 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); //입력 시
        int B = Integer.parseInt(st.nextToken()); //입력 분
        int C = Integer.parseInt(br.readLine()); //조리 시간


        int total = A * 60 + B + C;// 총 분으로 변환해서 더하고, 다시 시/분으로 환산
        int hour = (total/60) % 24; // 24시가 넘으면 다음 날로 순환 （나머지로 계산되는 값으로）
        int minute = total % 60; // hour 계산하고 남은 나머지를 계산하면 ｍｉｎ은 계산할 수 있음。



        /*if (B + C <= 59){
            System.out.println(A + " " + B+C);
        }*/



    }
}


