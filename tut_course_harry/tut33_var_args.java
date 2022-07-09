public class tut33_var_args {
    static int sum(int ...arr){   // unlimited argument;
        int s= 0;
        for (int i:arr){
            s += i;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sum(1, 5,6));
    }
}
