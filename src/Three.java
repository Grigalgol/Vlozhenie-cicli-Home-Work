import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int d=0;
        int flag=0;
        for (int j = a; j <= b; j++) {
            d=0;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) d++;
            }
                if (d < 2) {
                    System.out.print(" " + j);
                    flag=1;
                }
        }
        if(flag==0) System.out.print(flag);
    }
}