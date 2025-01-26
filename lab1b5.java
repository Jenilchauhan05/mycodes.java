// Write a program that reads a number in meters, converts it to feet, and displays the result.

import java.util.Scanner;
public class lab1b5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the total meters ");
        double meters = sc.nextDouble();
        
        double feet = meters * 3.28084;
        System.out.println(meters + " meters is equal to " + feet + " feets ");
        sc.close();
    }
}
