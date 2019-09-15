import java.util.Scanner;

public class M
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a, c=a=sc.nextLong();
        long b= sc.nextLong();
        sc.close();
        a=b;
        b=c;
        System.out.println(a + " " + b);
    }
}
