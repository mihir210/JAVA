public class tut28_2D_array {
    public static void main(String[] args) {
        int [][] a = new int[2][2];

        a[0][0] = 5;
        for (int i[]:a){
            for (int j: i){
                System.out.println(j);
            }
        }
    }
}
