import java.util.Scanner;

public class A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();
        System.out.println(a>b?a:b);
    }
}
