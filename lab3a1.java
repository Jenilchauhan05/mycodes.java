import java.util.Scanner;
public class lab3a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter marks of subject1");
        int mark1 = sc.nextInt();
        System.out.println("enter marks of subject2");
        int mark2 = sc.nextInt();
        System.out.println("enter marks of subject3");
        int mark3 = sc.nextInt();
        System.out.println("enter marks of subject4");
        int mark4 = sc.nextInt();
        System.out.println("enter marks of subject5");
        int mark5 = sc.nextInt();
        
        int avg = (((mark1+mark2+mark3+mark4+mark5) * 100) / 500);
        System.out.println("your percentage is " +avg +"%");
        
        if (avg >= 60) {
            System.out.println("you are in first division");
        }
        if (avg <= 59 && avg >= 51) {
            System.out.println("you are in second division");
        }
        if (avg <= 49 && avg >= 41) {
            System.out.println("you are in third division");
        }
        if (avg <= 40) {
            System.out.println("you are fail");
        }
        sc.close();
    }
}
