import java.util.Scanner;

public class While {
    public static <string> void main(String[] args){
//        int i=1;
//        while(i<=10)
//        {
//            System.out.println("hello world");
//            i++;
//        }


//        int n,rem,rev=0;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a Number");
//        n=sc.nextInt();
//
//        While(n>0)
//        {
//            rem=n%10;
//            rev=rev*10+rem;
//            n=n10;
//            System.out.println(rev);
//
//        }
//
//        System.out.println("the reverse of a number is:");

//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        int rev = 0, rem;
//        int temp = num;
//        while (num > 0) {
//            rem = num % 10;
//            rev = rev * 10 + rem;
//            num = num / 10;
//        }
//        if (rev==temp) {
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not a palindrome");
//            }

//
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter a Number");
//            int num= sc.nextInt();
//            int n,rem,sum;
//            while(n+=0)
//            {
//
//                System.out.println("sum of digits is:");
//            }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num = sc.nextInt();
//        int sum = 0;
//        while (num > 0) {
//            int rem = num % 10;
//            sum = sum + rem;
//            num = num / 10;
//        }
//        System.out.println("Sum of digits is: " + sum);



        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number:");

        int num = 153;
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }









    }
}
