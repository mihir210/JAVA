//package exp_1;
import java.util.Scanner;
public class j4_pat2 {
    public static void main(String[] args) {
        System.out.println("enter the number of line");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n/2; i++) {
            for (int k = 0; k < n/2 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < n/2; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n/2 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
