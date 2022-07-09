public class tut58_inheritance_in_interface {
    static interface samp{
        void fun1();
        void fun2();
    }

    static interface samp2 extends samp{
        void fun3();
    }

    static class sampleclass implements samp2{
        public void fun3(){

            System.out.println("fun3");
        }
        public void fun1(){

            System.out.println("fun1");
        }
        public void fun2(){

            System.out.println("fun2");
        }
    }

    public static void main(String[] args) {

    }
}
