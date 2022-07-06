package exp_1;
import java.util.Scanner;
public class j1_fibo {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = 0, t2= 1;

        System.out.printf("%d\t%d\t", t1, t2);
        for (int i = 0; i < n - 2; i++) {
            int next = t1+t2;
            System.out.print(next + "\t");
            t1= t2;
            t2 = next;
        }
    }
}
