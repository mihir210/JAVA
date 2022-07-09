public class tut49_dynamic_method_dispatch {
    static class test{
        public void name(){
            System.out.println("my name is mihir");

        }
        public void good(){
            System.out.println("good morning");
        }

    }
    static class test2 extends test{
        public void name(){
            System.out.println("my name is mihir class 2");
        }

        public void wel(){
            System.out.println("welcome");
        }
    }

    public static void main(String[] args) {
//        test s1 = new test();
//        s1.name();

        test s1 = new test2();   ///polymorphism
        s1.good();
        s1.name();
    }
}
