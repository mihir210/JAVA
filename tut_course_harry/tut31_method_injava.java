public class tut31_method_injava {
    static int logic(int x, int y)    // static because wee call static as simple call if we remove static then we need object to call
    {
        int z;
        if (x>y){
            z= x+y;
        }
        else{
            z = (x+y) *5;
        }
        return z;
    }
    public static void main(String[] args) {
        System.out.println(logic(1, 4));

    }
}
