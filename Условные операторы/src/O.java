import java.util.Scanner;

public class O
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextLong();
        double b = sc.nextLong();
        double c = sc.nextLong();
        double d = sc.nextLong();
        sc.close();
        if (c == 0 && d == 0)
        {
            System.out.println("NO");
            return;
        }
        if (a == 0)
        {
            if (b == 0)
                System.out.println("INF");
            else
                System.out.println("NO");
            return;
        }
        double x = -b / a;
        boolean bool = x == (int) x && c * x + d != 0;
        System.out.println(bool? (int) x : "NO");
    }
}
