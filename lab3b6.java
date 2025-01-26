// Write a program to find that given number is palindrome or not. 

import java.util.Scanner;
public class lab3b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        
        int number = n;
        int reverse = 0;
        
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        
        if (number == reverse) {
            System.out.println(number +" is a palindrome number");
        }
        else {
            System.out.println(number +" is not a palindrome number");
        }
        sc.close();
    }
}
