

public class tut42_constructor {
    static class stu{
        private int id;
        public stu(int a){
            id  =a;
        }

        public int getId() {
            return id;
        }
    }
    public static void main(String[] args) {
        stu s1= new stu(4);
        System.out.println(s1.getId());
    }
}
