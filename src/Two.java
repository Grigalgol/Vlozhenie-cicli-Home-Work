import java.util.*;
public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b= in.nextInt();
        int s=0;
        while (a!=0 && b!=0)
        {
            if (a>b) a=a-b;
            else b=b-a;
            s++;
        }
        System.out.println((a+b) + " " + (s));
    }
}