import java.util.Scanner;

public class L
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        System.out.println((k%m==0||k%n==0)&&k<m*n?"YES":"NO");
    }
}
