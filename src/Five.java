import java.util.*;
public class Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int max=a, k=1;
        while (a>0) {
            a= in.nextInt();
            if(a>max) {
                max=a; k=1;
            }
            else if(a==max) k++;
        }
        System.out.println(k);
    }
}