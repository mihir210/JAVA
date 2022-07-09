public class tut18_switch {
    public static void main(String[] args) {
        int mark = 90;
        switch (mark/10){
            case 10:
            case 9:
            case 8:
                System.out.println("A");
                break;
            case 7:
            case 6:
            case 5:
                System.out.println("B");
                break;
        }
    }
}
