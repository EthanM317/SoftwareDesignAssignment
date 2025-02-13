// Example code
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = reader.next();

        System.out.println("Hello " + name + "!");
        
        
        System.out.print("Do you like coding? Enter y or n: ");
        char answer = reader.next().charAt(0);
        reader.close();

        System.out.println("You entered: " + answer);

    }
}
