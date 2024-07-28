import java.util.Scanner;

public class prime {
    public static <string> void main(String[] args)
    {
        int n,i,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();

        for(i=2;i<n;i++)
        {
            if(n%1==0)
            {
                flag=1;
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("the given number is prime");
        }

        else
        {
            System.out.println("number is not prime");
        }



















    }
}
