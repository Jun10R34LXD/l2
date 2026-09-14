
/**
 *This is a class that asks the user the the cost of their meal
 *and calculates the total cost with tax and tip.
 *
 * @author Luis Castillo
 * @version v1.0
 * @since 9/1/2026
 */
import java.util.Scanner;
public class ProgChall13
{   public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter meal amount: ");
        double amount = keyboard.nextDouble();
        final double TAX_RATE = 0.0675;
        final double TIP_RATE = 0.02;
        //6.75
        //20
        double tax = amount * TAX_RATE;
        double subTotal = amount + tax;
        double tip = subTotal * TIP_RATE;
        double total = tip + subTotal;
        System.out.printf("%nThe tax is: $%.2f%n", tax);
        System.out.printf("\nTip: $%.2f%n", tip);
        System.out.printf("\nThe meal cost with tax and tip is: $%.2f%n", total);
        
       //0.0674509803921569
        //.2
    
    }
}