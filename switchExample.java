import java.util.Scanner;

public class switchExample {
    public static void main(String args[]){
        char operator;
        double num1,num2,res;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number1");
        num1=sc.nextDouble();
        System.out.println("enter number2");
        num2=sc.nextDouble();
        System.out.println("enter the operator +,_,*,/");
        operator=sc.next().charAt(0);

        switch(operator){
            case'+':
                res=num1+num2;
                System.out.println("addition is :"+ res);
                break;
            case'-':
                res=num1-num2;
                System.out.println("subtraction is :"+ res);
                break;
            case'*':
                res=num1*num2;
                System.out.println("multiplication is :"+ res);
                break;
            case'/':
                res=num1/num2;
                System.out.println("division is :"+ res);
                break;
            default:
                System.out.println("incorrect operator entered");
        }







    }
}
