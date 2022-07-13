public class pass_by_reference {
    int num;
    pass_by_reference(){
        num=0;
    }

    static void update(pass_by_reference ob){
        ob.num++;
    }

    public static void main(String[] args) {
        pass_by_reference ob = new pass_by_reference();

        System.out.println(ob.num);
        update(ob);

        System.out.println(ob.num);
    }
}
