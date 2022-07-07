//package exp_1;
import java.util.Scanner;
public class j2_sumdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int sum=0, m;
        while (n>0){
            m = n %10;
            sum += m;
            n /=10;
        }
        System.out.println("sum = " +sum);

    }
}
