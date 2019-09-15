import java.util.Scanner;

public class A
{

    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(Math.sqrt(a * a + b * b));

    }
}
