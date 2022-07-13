public class j3_with_duplication_digit {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=4; j++) {
                for (int k = 1; k <=4 ; k++) {
                    for (int l = 1; l <=4; l++) {
                        if (j>i && l<k){
                            System.out.println(i*1000+j*100+k*10 + l);
                        }
                    }
                }
            }
        }
    }
}
