import java.util.Scanner;

public class Y
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        int[] res = {0, 0, 0};
        int[] prices = {15, 125, 440};
        res[2] = (int) n / 60;
        n = n % 60;
        long t2 = 440;
        long t1 = n / 10 * prices[1] + n % 10 * prices[0];
        long t3 = (n / 10 + 1) * prices[1];
        long t4 = n * prices[0];
        if (t2 < t1 && t2 < t3 && t2 < t4)
        {
            ++res[2];
        }
        else if (t1 < t3 && t1 < t4)
        {
            res[1] += n / 10;
            res[0] += n % 10;
        }
        else if (t3 < t4)
        {
            res[1] += n / 10 + 1;
        }
        else
        {
            res[0] += n;
        }
        System.out.println(res[0] + " " + res[1] + " " + res[2]);


    }


}
