// Write a java program to take user input through Command Line Argument.

public class lab1a2 {
    public static void main(String[] args){
        
        if (args.length > 0) {
            System.out.println("command line arguments recieved ");
            
            for (int i = 0; i < args.length; i++) {
                System.out.println("argument " + (i + 1) + ": " + args[i]);
            }
        }
        
        else{
            System.out.println("no command line arguments provided ");
        }
    }
}
