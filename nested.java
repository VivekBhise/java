import java.util.Scanner;

public class nested {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter present/absent");
        String Status = scan.next();

        if(Status.equalsIgnoreCase("present")){
            System.out.println("Enter your score");
            int score=scan.nextInt();
            if(score<99 && score>=80){
                System.out.println("pass-0+");
            }
            else if(score<80 && score>=70){
                System.out.println("pass-A");
            }
            else if(score<60 && score>=50){
                System.out.println("pass-B");
            }
            else if(score<40 && score>=30){
                System.out.println("pass-D");
            }
            else if(score<30 && score>=1){
                System.out.println("Fail");
            }
        }else{
            System.out.println("Fail-you are absent,attempt KT exam");
        }

//        if (check.equalsIgnoreCase("yes")) {
//            System.out.println("knows programming but dont know devlopment");
//        }else {
//            System.out.println("does not know programming lang");
//        }


    }
}
