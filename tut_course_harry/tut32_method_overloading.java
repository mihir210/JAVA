public class tut32_method_overloading {
    static int sum(int x, int y){
        return (x+y);
    }
    static double sum(double x, double y){
        return (x+y);
    }

    public static void main(String[] args) {
        System.out.println(sum(4.5, 7.8));
    }
}
