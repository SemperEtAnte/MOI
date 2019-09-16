import java.util.Scanner;

public class X
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        short cows = sc.nextShort();
        int ost = cows%10;
        int del = (cows/10)%10;
        String format = cows + " %s";
        String[] formats = {"korova", "korovy", "korov"};
        if(del != 1)
        {
            if(ost == 1)
            {
                System.out.println(String.format(format, formats[0]));
                return;
            }
            else if(ost > 1 && ost<5)
            {
                System.out.println(String.format(format, formats[1]));
                return;
            }
        }
        System.out.println(String.format(format, formats[2]));

    }
}
