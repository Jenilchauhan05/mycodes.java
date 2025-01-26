// Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f-32*5/9 )

import java.util.Scanner;
public class lab2b4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature in fahrenheit");
        double f = sc.nextDouble();
        
        System.out.println("temperature in celsius is " +(f-32)*5/9);
        sc.close();
    }
}
