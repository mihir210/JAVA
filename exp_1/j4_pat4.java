//package exp_1;
import java.util.Scanner;
public class j4_pat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of line ");
        int n = sc.nextInt();
        for (int i = 0; i < n/2; i++) {
            for (int k = 0; k < n/2 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n/2; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n/2 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
