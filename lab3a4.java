// Write a program to check that the given number is prime or not.

import java.util.Scanner;
public class lab3a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println("n is prime number");
        }
        else {
            System.out.println("n is not prime number");
        }
        sc.close();
    }
}
