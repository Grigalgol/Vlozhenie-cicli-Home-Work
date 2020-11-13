import java.util.*;
public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c= in.nextInt(), n= in.nextInt();
        int d=0;
        int i1, i2, i3;
        for(i1=0; i1<=n/a; i1++){
            for(i2=0; i2<=(n-i1*a)/b; i2++) {
                if((n-i1*a-i2*b)>=0 && (n-i1*a-i2*b)%c==0) d++;
            }
        }
        System.out.println(d);
        for(i1=0; i1<=n/a; i1++){
            for(i2=0; i2<=(n-i1*a)/b; i2++) {
                if((n-i1*a-i2*b)>=0 && (n-i1*a-i2*b)%c==0) {
                    System.out.print(i1 + " " + i2 + " " + ((n-i1*a-i2*b)/c));
                    System.out.println("");
                }
            }
        }
    }
}