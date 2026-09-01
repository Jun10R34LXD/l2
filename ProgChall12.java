
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
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a city: ");
        String cityname = sc.nextLine();
        
        char firstc = cityname.charAt(0);
        int letnum = cityname.length();
        String lowerc = cityname.toLowerCase();
        String upperc = cityname.toUpperCase();
        
        System.out.println("\nNumber of characters: " + letnum);
        System.out.println("\nUppercase: " + upperc);
        System.out.println("\nLowercase: " + lowerc);
        System.out.println("\nFirst character: " + firstc);
    }
}