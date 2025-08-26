import java.util.*;
public class num2884 {
    public static void main (String args[]){
        Scanner a = new Scanner (System.in);


        int M = a.nextInt();
        int H = a.nextInt();

        if(M >= 45) {
            M -= 45;
        } else {
            M =+ 60 - 45;
            H -= 1;
            if(H < 0) {
                H = 23;
            }
        }
        System.out.println(H + " " + M);
    }
}
