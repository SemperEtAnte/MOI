import java.util.Scanner;

public class E
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int  t=  sc.nextInt();
        sc.close();
        boolean b = v<0;
        v = Math.abs(v);
        int res = (v*t)%109;
        if(b)
            res=109-res;
        System.out.println(res==109?0:res);
    }
}
