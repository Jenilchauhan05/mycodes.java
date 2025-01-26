// Write a program to print prime numbers between given range. 

import java.util.Scanner;
public class lab3c7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a start number");
        int start = sc.nextInt();
        System.out.println("enter a end number");
        int end = sc.nextInt();
        
        System.out.println("prime numbers between " + start + " and " + end + " are ");
        
        for (int n = start; n < end; n++) {
            if (n > 1) {
                boolean isprime = true;
                
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isprime = false;
                        break;
                    }
                }
                
                if (isprime) {
                    System.out.println(n + "");
                }
            }
        }
        sc.close();
    }
}
