package java_with_apnaCollege;
import java.util.*;

public class loop {
    public static void main(String[] args) {
        // for (int i = 0; i < 11; i++) {
        //     System.out.println(i);
        // }

// ============== While loop=========================
        // int i = 0;
        // while (i<11) {
        //     System.out.println(i);
        //     i++;
        // }

// ============== Do While loop=========================
        // int i = 0;
        // do {
        //     System.out.println(i);
        //     i++;
        // } while ( i < 11);

// write a progrma sum of all natural number from 1 to 10
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number :");
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i =1 ; i < n;i++){
        //     sum = sum + i;
        // }
        // System.out.println("Sum: " + sum);

// print the table of input number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();

        for(int i = 1; i < 11 ; i++){
            System.out.println(n + " * " + i + " = " + n * i);
        }
        System.out.println("hello rohit");
    }
}
