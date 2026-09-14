
/**
 *This is a class that asks the user for a city and returns
 *the number of characters,the city's name fully in uppercase and lowercase,
 *and the first character.
 *
 * @Luis Castillo
 * @v1.0
 * @since 8/25/2026
 */
import java.util.Scanner;
public class ProgChall12
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a city: ");
        String cityName = keyboard.nextLine();
      
        System.out.println("\nNumber of characters: " + cityName.length() + " characters.");
        System.out.println("\nUppercase: " + cityName.toUpperCase());
        System.out.println("\nLowercase: " + cityName.toLowerCase());
        System.out.println("\nFirst character: " + cityName.charAt(0));
    }
}