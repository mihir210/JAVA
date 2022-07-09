public class tut59_polymorphism_interfarence {

    static interface camera{
        void takepic();
    }

    static interface wifi{
        String[] getnet();
        void connect(String net);
    }

    static class cellphone{
        void call(int no){
            System.out.println("calling..."  + no);
        }

    }

    static class smartphone extends cellphone implements wifi,camera {
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
        camera c1 = new smartphone();
        c1.takepic();  /// only camera access
    }
}
