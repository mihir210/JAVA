/*
write a program that reads email address from user and check whether email is valid or not if valid then saparate email in form of email id and server name
 */

import java.util.Scanner;
public class j3_email_check {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the email id");
        String s1 = sc.nextLine();

        int x = s1.indexOf("@");
        int y = s1.indexOf(".");

        if (x!=-1 && y!=-1){
            System.out.println("Email is valid");

            System.out.println("id name =");
            for (int i = 0; i < x; i++) {
                System.out.print(s1.charAt(i));
            }

            System.out.println("\nserver name =");
            for (int i = x+1; i < s1.length(); i++) {
                System.out.print(s1.charAt(i));
            }
        }
        else {
            System.out.println("Email is not valid");
        }
    }
}
