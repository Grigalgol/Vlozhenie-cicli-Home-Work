import java.util.*;
public class Six {
    public static void main(String[] args) {
        int max, a, b, k;
        max=1;
        k=0;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b=a;
        do {
            if(a>b) {
                if(k>max) max=k;
                k=1;
                while (a>b && a>0) {
                    k++;
                    b=a;
                    a = in.nextByte();
                }
            }
            if(a<b) {
                if(k>max) max=k;
                k=1;
                while (a<b && a>0) {
                    k++;
                    b=a;
                    a=in.nextInt();
                }
            }
            if(a==b) {
                if(k>max) max=k;
                k=1;
                b=a;
                a= in.nextInt();
            }
        } while(a>0);
        if (k>max) System.out.println(k);
        else System.out.println(max);
    }
}
