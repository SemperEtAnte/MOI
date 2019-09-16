import java.util.Scanner;

public class B
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long year = sc.nextLong();
        sc.close();
        boolean b = (year%4==0&&year%100!=0) || year%400==0;
        System.out.println(b?"YES":"NO");
    }
}
