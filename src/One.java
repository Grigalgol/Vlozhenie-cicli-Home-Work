import java.util.*;
public class One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c=0;
        int b,d;
        while (n!=0 && c<1) {
            c = 0;
            b = n % 10;
            n = n / 10;
            d = n;
            while (d != 0) {
                if (d % 10 == b) c = 1;
                d /= 10;
            }
        }
        if(c==1) System.out.println("YES");
        else System.out.println("NO");
        }
    }
