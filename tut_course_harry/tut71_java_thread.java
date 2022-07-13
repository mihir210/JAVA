public class tut71_java_thread {
    static class mythread implements Runnable{
        public void run(){
            System.out.println("i am a thread");
            System.out.println("i am a thread");
            System.out.println("i am a thread");
            System.out.println("i am a thread");
            System.out.println("i am a thread");
            System.out.println("i am a thread");
            System.out.println("i am a thread");
            System.out.println("i am a thread");
            System.out.println("i am a thread");
            System.out.println("i am a thread");
            System.out.println("i am a thread");
            System.out.println("i am a thread");
        }
    }
    static class mythread2 implements Runnable{
        public void run(){
            System.out.println("thread 2");
            System.out.println("thread 2");
            System.out.println("thread 2");
            System.out.println("thread 2");
            System.out.println("thread 2");
            System.out.println("thread 2");
            System.out.println("thread 2");
            System.out.println("thread 2");
            System.out.println("thread 2");
            System.out.println("thread 2");
            System.out.println("thread 2");
            System.out.println("thread 2");
            System.out.println("thread 2");
            System.out.println("thread 2");
        }
    }


    public static void main(String[] args) {
        mythread t1 = new mythread();
        mythread2 t2 = new mythread2();

        Thread gun1 = new Thread(t1);
        Thread gun2 = new Thread(t2);

        gun1.start();
        gun2.start();
    }
}
