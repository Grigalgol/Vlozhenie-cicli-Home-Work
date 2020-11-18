import java.util.*;
public class Senen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int [n];
        int i;
        int p=0, f=0;
        for(i=0; i<a.length; i++) {
            a[i]=in.nextInt();
        }
        int b[] = new int [n];
        int c[] = new int [n];
        for(i=0; i<a.length; i++) {
            if(a[i]!=0) {
                b[p]=a[i];
                p++;
            }
            else {
                c[f]=a[i];
                f++;
            }
        }
        for(i=0; i<p; i++) System.out.print(b[i] + " ");
        for(i=0; i<f; i++) System.out.print(c[i] + " ");
    }
}