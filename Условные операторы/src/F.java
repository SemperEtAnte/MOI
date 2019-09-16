import java.util.Scanner;

public class F
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        sc.close();
        long max = a;
        if(b>max)
            max = b;
        if(c>max)
            max =c;
        System.out.println(max);
    }
}
