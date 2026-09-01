
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
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your first name:  ");
        String firstname = sc.nextLine();
        
        System.out.println("Enter your middle name:  ");
        String middlename = sc.nextLine();
        
        System.out.println("Enter your last name:  ");
        String lastname = sc.nextLine();
        
        System.out.print("Your full name is: " + firstname + " " + middlename + " " + lastname);
        
        char firstint = firstname.charAt(0);
        char middleint = middlename.charAt(0);
        char lastint = lastname.charAt(0);
        System.out.println("\nYour initials are: " + firstint + middleint + lastint );
        
        
        sc.close();
        
    }
    
}