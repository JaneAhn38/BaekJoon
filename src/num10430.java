import java.sql.SQLOutput;
import java.util.*;
public class num10430 {
    public static void main(String[] args){
        Scanner a = new Scanner (System.in);
        int A = a.nextInt();
        int B = a.nextInt();
        int C = a.nextInt();
        //Double result = a.nextDouble();

        System.out.println(((A+B)%C));
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C)%C));
    }
}
