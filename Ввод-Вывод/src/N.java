import java.util.Scanner;

public class N
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        short l = sc.nextShort();
        sc.close();
        int h = 9;
        int m = 0;
        int r = l/2;
        int temp = (l * 45)+r*5+(l%2==0?r-1:r)*15;
        h += temp / 60;
        m += temp % 60;
        System.out.println(h + " " + m);
    }
}
