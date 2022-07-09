

public class tut46_constructor_inheritance {
    static class Base1{
        int x;
        public Base1(int a){
            x =a;
        }
        public int getX() {
            return x;
        }
    }

    static class Derived1 extends Base1{
        int y;
        public Derived1(int a, int b){
            super(a);
            y = b;
        }
        public int getY() {
            return y;
        }
    }

    public static void main(String[] args) {
        Derived1 d1 = new Derived1(1,4);

        System.out.println(d1.getX());
        System.out.println(d1.getY());
    }
}
