import java.util.*;
public class num2588 {
    public static void main(String[] args){
        Scanner a = new Scanner (System.in);
        int A = a.nextInt(); // 첫 번째 수 (3자리수)
        int B = a.nextInt(); // 두 번째 수 백의 자리수
        int C = a.nextInt(); // 두 번째 수 십의 자리수
        int D = a.nextInt(); // 두 번째 수 일의 자리수

        int E = A * D; // (3)에 해당하는 줄
        int F = A * (C*10); // (4)에 해당하는 줄
        int G = A * (B*100); // (5)에 해당하는 줄
        int H = A * (100*B + 10*C + D); //(6)에 해당하는 줄


        System.out.println(E);
        System.out.println(F);
        System.out.println(G);
        System.out.println(H);


    }

}
Main