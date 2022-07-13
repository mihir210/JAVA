import java.util.Scanner;


public class j2_user_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a  = sc.nextInt();

        System.out.println("Enter the operator :");
        String  c= sc.next();

        System.out.println("Enter the second number :");
        int b = sc.nextInt();

        switch (c.charAt(0)){
            case '+':
                System.out.println("sum = " + (a+b));
                break;
            case '-':
                System.out.println("sub = " + (a-b));
                break;
            case '*':
                System.out.println("mul = " + (a*b));
                break;
            case '/':
                System.out.println("div = " + (a*1.0/b));
                break;
        }
    }
}
