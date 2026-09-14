
/**
 * This is a class that asks for the user's first, middle, and last names 
 * and prints their full name and initials.
 *
 * @author Luis Castilo
 * @version v1.0
 * @since 9/1/2026
 */
import java.util.Scanner;
public class ProgChall2
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter your first name:  ");
        String firstName = keyboard.nextLine();
        
        System.out.print("Enter your middle name:  ");
        String middleName = keyboard.nextLine();
        
        System.out.print("Enter your last name:  ");
        String lastName = keyboard.nextLine();
        
        System.out.print("Your full name is: " + firstName + " " + middleName + " " + lastName);
        
        char firstInt = firstName.charAt(0);
        char middleInt = middleName.charAt(0);
        char lastInt = lastName.charAt(0);
        System.out.println("\nYour initials are: " + firstInt + middleInt + lastInt );
        
        
        keyboard.close();
        
    }
    
}