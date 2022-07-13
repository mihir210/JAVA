public class tut69_multithreading {
    static class mythread extends Thread{
        @Override
        public void run(){
            while (true){
                System.out.println("mythread");
            }
        }
    }

    static class mythread2 extends Thread{
        @Override
        public void run(){
            while (true){
                System.out.println("mythread2");
            }
        }
    }

    public static void main(String[] args) {
        mythread m = new mythread();
        mythread2 n = new mythread2();
        m.start();
        n.start();
    }
}
