// Write a program to check whether a number is even or odd.

import java.util.Scanner;
public class lab3a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("n is even");
        }
        else {
            System.out.println("n is odd");
        }
        sc.close();
    }
}
