public class tut57_default_method {

    static interface camera{
        void takepic();
        default void reord(){
            System.out.println("4k pic");
        }
    }

    static interface wifi{
        String[] getnet();
        void connect(String net);
    }

    static class cellphone{
        void call(int no){
            System.out.println("calling"  + no);
        }

    }

    static class smartphone extends cellphone implements wifi, camera{
        public void takepic(){
            System.out.println("take pic");
        }
        public String[] getnet(){
            System.out.println("get net");
            String [] netw = {"hello", "good"};
            return netw;
        }

        public void connect(String net) {
            System.out.println("connecting..."+ net);
        }
    }


    public static void main(String[] args) {
        smartphone ms = new smartphone();
        String[] arr = ms.getnet();
        for (String i:
             arr) {
            System.out.println(i);
        }

        ms.reord();
    }
}
