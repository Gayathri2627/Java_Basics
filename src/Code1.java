import java.util.Scanner;

public class Code1 {

    public static void main(String args[])
    {
        int rem,rev=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter input:");
        int num=s.nextInt();

        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        //System.out.println(rev);

        while(rev>0)
        {
            System.out.println(rev%10);
            rev=rev/10;
        }

    }
}
