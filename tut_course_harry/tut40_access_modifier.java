

public class tut40_access_modifier {
    static class emp{
        private int id;
        public void set(int a){
            id = a;
        }
        public int get(){
            return id;
        }
    }
    public static void main(String[] args) {
        emp obj = new emp();
        obj.set(3);
        System.out.println(obj.get());
    }
}
