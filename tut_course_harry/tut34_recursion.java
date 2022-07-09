public class tut34_recursion {
    static int fac(int n){
        if (n>0)
            return (n * fac(n-1));
        else
            return 1;
    }
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}
