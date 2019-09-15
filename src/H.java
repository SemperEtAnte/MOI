import java.util.Scanner;

public class H
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        sc.close();
        System.out.println((num/10)%10);

    }
}
