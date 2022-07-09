
public class tut45_iheritance {
    static class Base{
        int x;
        public int getX()
        {
            return this.x;
        }
        public void setX(int a){
            x = a;
        }
    }

    static class Derived extends Base{
        int y;
        public int getY(){
            return this.y;
        }
        public void setY(int b){
            this.y = b;
        }
    }
    public static void main(String[] args) {
        Derived d1 = new Derived();

        d1.setX(1);
        d1.setY(3);

    }
}
