//package exp_1;
import java.util.Scanner;
public class j3_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n  = sc.nextInt();
        int r, rev= 0;
        while (n!=0){
            r = n%10;
            rev = rev*10 + r;
            n /=10;
        }

        System.out.println("Reverse is =" + rev);
    }
}
