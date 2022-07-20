/*

write a program to mearge the two arrays in third array also the third array in ascending order
 */

import java.util.Scanner;
public class j1_mearge_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int m = sc.nextInt();
        System.out.println("Enter the size of second array");
        int n = sc.nextInt();

        int[] a = new int[m];
        int[] b = new int[n];

        System.out.println("Enter the first array :");
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the element :" + i);
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the second array :");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element :" + i);
            b[i] = sc.nextInt();
        }

        int[] c = new int[m+n];
        int j;
        for ( j = 0; j < m; j++) {
            c[j] = a[j];
        }

        for (int k = 0; k < n; k++) {
            c[j] = b[k];
            j++;
        }

        for (int x = 0; x < c.length-1; x++) {
            for (int y = 0; y < c.length-1-x; y++) {
                if (c[y]>c[y+1]){
                    int t = c[y];
                    c[y] = c[y+1];
                    c[y+1] = t;
                }
            }
        }

        for (int r :
                c) {
            System.out.print(r + "\t");
        }


    }
}
