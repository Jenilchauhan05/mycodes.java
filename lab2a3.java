// Write a program to calculate the area of Rectangle.

import java.util.Scanner;
public class lab2a3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of rectengle");
        int l = sc.nextInt();
        System.out.println("enter width of rectengle");
        int b = sc.nextInt();
        
        System.out.println("area of rectengle is " +(l * b));
        sc.close();
    }
}
