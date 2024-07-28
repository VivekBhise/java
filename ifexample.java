import java.util.Objects;
import java.util.Scanner;

public class ifexample {
    public static  void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1");
        int num = scan.nextInt();
        System.out.println("Enter number2");
        int num1 = scan.nextInt();

        if (num == num1) {
            System.out.println("both number are equals");

        } else {
            System.out.println("both number are not equal");
        }



//        String check = scan.next();

//        if(Objects.equals(check, "yes")){
//            System.out.println("knows programming lang");
//
//        }
//        else{
//            System.out.println("does not knows programming lang");
            //}
    }
}
