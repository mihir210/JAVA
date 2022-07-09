public class tut48_method_overriding {
static  class base{
    public void fun1() {
        System.out.println("hello base");
    }
}

static class derived extends base{
    @Override
    public void fun1(){
        System.out.println("hello derived");
    }
}

    public static void main(String[] args) {
        derived d1 = new derived();

        d1.fun1();
    }
}
