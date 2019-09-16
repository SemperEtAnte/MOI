import java.util.Scanner;

public class K
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        short fx = sc.nextShort();
        short fy = sc.nextShort();
        short ox = sc.nextShort();
        short oy = sc.nextShort();
        sc.close();
        boolean b = (Math.abs(fx - ox) == 2 && Math.abs(fy - oy) == 1) || (Math.abs(fy - oy) == 2 && Math.abs(fx - ox) == 1);
        System.out.println(b ? "YES" : "NO");

    }
}
