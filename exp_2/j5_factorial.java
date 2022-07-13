import java.util.Scanner;

public class j5_factorial {

    static int fac(int a){
        if(a<=1)
            return 1;
        else
            return a* fac(a-1);
    }

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        System.out.println(fac(n));
    }
}
