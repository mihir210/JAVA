public class j1_command_cal {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        if (args[1].equals("+")){
            System.out.println("sum = "+ (a+b));
        } else if (args[1].equals("-")) {
            System.out.println("sub = " + (a-b));
        } else if (args[1].equals("@")) {
            System.out.println("mul = " + (a*b));
        } else if (args[1].equals("/")) {
            System.out.println("div = " + (a*1.0/b));
        }
    }
}
