import java.util.Scanner;


public class j6_nth_fiboterm {

    static int fibo(int a){
        if (a<=1)
            return a;
        return fibo(a-1) + fibo(a-2);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        int c = fibo(n);

        System.out.println("fibo is " + c);
    }
}
