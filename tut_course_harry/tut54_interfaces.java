public class tut54_interfaces {
    static interface bicycle{
        void breake(int de);
        void speed(int in);
    }

    static class newd implements bicycle{
        void horn(){
            System.out.println("pip ....");

        }
        public void breake(int de){                                 // for interface method make public
            System.out.println("break");
        }
        public void speed(int in){
            System.out.println("speed");
        }
    }


    public static void main(String[] args) {
        newd n1 = new newd();
        n1.breake(1);
    }

}
