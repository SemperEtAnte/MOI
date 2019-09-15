import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class L
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long time = sc.nextLong()*1000L;
        sc.close();
        SimpleDateFormat sdf = new SimpleDateFormat("H:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        System.out.println(sdf.format(new Date(time)));
    }
}
