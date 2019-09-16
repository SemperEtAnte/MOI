import java.util.Scanner;

public class N
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextLong();
        sc.close();
        if(a == 0)
        {
            if(b == 0)
                System.out.println("INF");
            else
                System.out.println("NO");
            return;
        }
        double x = -b/a;
        System.out.println(x==(int)x?(int)x:"NO");

    }
}
