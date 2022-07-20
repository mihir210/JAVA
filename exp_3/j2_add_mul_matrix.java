/*
write a program to multiply and add two matrix
 */

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
public class j2_add_mul_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.for sum \n 2.for mul");
        int n= sc.nextInt();

        if (n==1){

            System.out.println("Enter the size of matrix :");
            int k = sc.nextInt();

            int[][] a = new int[k][k];
            int[][] b = new int[k][k];

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.println("Enter the elemnt of index" + i + " " + j);
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the second matrix");
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.println("Enter the elemnt of index" + i + " " + j);
                    b[i][j] = sc.nextInt();
                }
            }


            int[][] c = new int[k][k];

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    c[i][j] = a[i][j]+ b[i][j];
                }
            }

            for (int[] d:
                 c) {
                for (int s:
                     d) {
                    System.out.printf("%4d", s);
                }
                System.out.println();
            }


        } else if (n==2) {
            System.out.println("Enter the raw and column of first matrix");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();

            System.out.println("Enter the raw and column of second matrix");
            int r2 =sc.nextInt();
            int c2 =sc.nextInt();

            if (c1==r2){
                int[][] a = new int[r1][c1];
                int[][] b = new int[r2][c2];
                int[][] c = new int[r1][c2];

                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        System.out.println("Enter the element "+ i + " " + j);
                        a[i][j] = sc.nextInt();
                    }
                }

                System.out.println("enter the second array");
                for (int i = 0; i < r2; i++) {
                    for (int j = 0; j < c2; j++) {
                        System.out.println("Enter the element "+ i + " " + j);
                        b[i][j] = sc.nextInt();
                    }
                }

                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        c[i][j]  = 0;
                        for (int l = 0; l < r2; l++) {
                            c[i][j] += a[i][l]*b[i][l];
                        }
                    }
                }

                for (int[] is :
                        c) {
                    for (int is2:
                         is) {
                        System.out.printf("%4d", is2);
                    }
                    System.out.println();
                }
            }
        }
    }
}
