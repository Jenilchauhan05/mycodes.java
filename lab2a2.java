// Write a program to create basic calculator by getting 2 numbers and 1 string (operation) from the user and apply the operation given in a string on the given numbers.

import java.util.Scanner;
public class lab2a2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a");
        int a = sc.nextInt();
        System.out.println("enter number b");
        int b = sc.nextInt();
        System.out.println("enter your choice");
        String s = sc.next();
        
        if (s.equals("+")) {
            System.out.println("a + b = " +(a + b));
        }
        else if(s.equals("-")) {
            System.out.println("a - b = " +(a - b));
        }
        else if(s.equals("*")) {
            System.out.println("a * b = " +(a * b));
        }
        else if(s.equals("/")) {
            System.out.println("a / b = " +(a / b));
        }
        sc.close();
        
    }
}
