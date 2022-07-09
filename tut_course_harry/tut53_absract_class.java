public class tut53_absract_class {
    abstract static class base{
        public base(){
            System.out.println("constuctor base");
        }
        public void he(){
            System.out.println("hello base");
        }
        abstract public void greet();   /// design in derived class
    }
    static class derived extends base{
        @Override
        public void greet(){
            System.out.println("good morning");
        }
    }

    abstract static class derived2 extends base{
        public void th(){
            System.out.println("i am good ");                 // either you make abstrat class or override
                                                          /// abstart class does not make object
        }
    }

    public static void main(String[] args) {
        derived d1 = new derived();
    }
}
