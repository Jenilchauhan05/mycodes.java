// Write a program that prompts the user to enter a letter and check whether a letter is a vowel or a consonants.

import java.util.Scanner; 
public class lab1c6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a single letter ");
        char letter = sc.next().toLowerCase().charAt(0);
        
        if (Character.isLetter(letter)) {
            
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is vowel ");
            }
            
            else {
                System.out.println(letter + " is consonant ");
            }
        }
        
        else {
            System.out.println("invalid input. pls enter single alphabet letter ");
        }
        sc.close();
    }
}
