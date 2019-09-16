import java.util.Scanner;

public class I
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        short fx = sc.nextShort();
        short fy = sc.nextShort();
        short ox = sc.nextShort();
        short oy = sc.nextShort();
        sc.close();
        boolean b = fx == ox || fy == oy || Math.abs(ox - fx) == Math.abs(oy - fy);
        System.out.println(b?"YES":"NO");
    }
}
