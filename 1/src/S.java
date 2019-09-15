import java.util.Scanner;

public class S
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println((1+(h-b-1)/(a-b)));
    }
}
