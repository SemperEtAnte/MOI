import java.util.Scanner;

public class B
{

    private static final String bigger = "The next number for the number %d is %d.";
    private static final String less = "The previous number for the number %d is %d.";

    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(String.format(bigger, a, (a + 1)));
        System.out.println(String.format(less, a, (a - 1)));

    }
}
