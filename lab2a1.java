// Write a program that prompts the user to enter three numbers. Find the largest number using ternary operators.

import java.util.Scanner;
public class lab2a1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a");
        int a = sc.nextInt();
        System.out.println("enter number b");
        int b = sc.nextInt();
        System.out.println("enter number c");
        int c = sc.nextInt();
        
        int largest = (a >= b) ? (a >= c ? a : c) : (b >= c ? b : c);
        System.out.println("largest number is " +largest);
        sc.close();
        
    }
}
