package java_with_apnaCollege;

import java.util.Scanner;

public class condi_stmnt {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
       if (a > b) {
        System.out.println(a+" is greater than "+b);
       } else {
        System.out.println(b+" is greater than "+a);
       }
    }
}
