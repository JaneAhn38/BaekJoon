import java.io.BufferedReader;   // 입력을 한 줄 단위로 읽는 클래스. 속도가 빠름.
import java.io.InputStreamReader; // byte stream을 문자 단위로 바꿔주는 역할. BufferedReader랑 같이 붙여씀.
import java.io.IOException; // 예외상황을 대비해 프로그램이 비정상적으로 종료되지 않도록.

public class num14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(a.readLine());
        int Y = Integer.parseInt(a.readLine());

        if (X > 0 && Y > 0) {
            System.out.println(1);
        } else if (X < 0 && Y > 0) {
            System.out.println(2);
        } else if (X < 0 && Y < 0) {
            System.out.println(3);
        } else if (X > 0 && Y < 0) {
            System.out.println(4);
        }
    }
}
