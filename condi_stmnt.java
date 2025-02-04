package java_with_apnaCollege;

import java.util.Scanner;

public class condi_stmnt {
    public static void main(String[] args) {
        // int a,b;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of a");
        // a = sc.nextInt();
        // System.out.println("Enter the value of b");
        // b = sc.nextInt();
        // if (a > b) {
        // System.out.println(a+" is greater than "+b);
        // } else {
        // System.out.println(b+" is greater than "+a);
        // }
        System.out.print("Enter the value of button :");
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Nameste");
                break;
            case 3:
                System.out.println("rohit");
            default:
                System.out.println("invalid input");
                break;
        }

    }

}
