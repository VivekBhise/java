import java.util.Scanner;

public class menuExample {
    static void display(){
        System.out.println("1 tea(rs.20)");
        System.out.println("2 black tea(rs.15)");
        System.out.println("3 coffee(rs.30)");
        System.out.println("4 chocolate cookie(rs.25)");
        System.out.println("5 sandwich(rs.50)");
        System.out.println("6 samosa(rs.20)");
        System.out.println("7 generate bill and exit");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to cafe");
        int sum = 0;
        while (true) {
            menuExample.display();
            System.out.println("enter choice");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("enter quantity");
                    int a = sc.nextInt();
                    sum = sum + 20 * a;
                    break;
                case 2:
                    System.out.println("enter quantity");
                    int b = sc.nextInt();
                    sum = sum + 15 * b;
                    break;
                case 3:
                    System.out.println("enter quantity");
                    int c = sc.nextInt();
                    sum = sum + 30 * c;
                    break;
                case 4:
                    System.out.println("enter quantity");
                    int d = sc.nextInt();
                    sum = sum + 25 * d;
                    break;
                case 5:
                    System.out.println("enter quantity");
                    int e = sc.nextInt();
                    sum = sum + 50 * e;
                    break;
                case 6:
                    System.out.println("enter quantity");
                    int f = sc.nextInt();
                    sum = sum + 20 * f;
                    break;
                default:
                    System.out.println("----total bill" + sum);
                    System.out.println("thank your for your order");
            }
        }
    }
}
