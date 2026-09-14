
/**
 *This class asks the user to input the amount of stocks they purchased
 *along with the cost of said stock, the class then returns the amount
 *the user paid for the stocks, the commission, and the total cost.
 *
 * @author Luis Castillo
 * @version v1.0
 * @since 9/1/2026
 */
import java.util.Scanner;
public class Progchall15
{   public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the amount of stocks purchased: ");
        int shares = keyboard.nextInt();
        System.out.println("Enter price per share");
        double stockPrice = keyboard.nextDouble();
        final double commissionRate = 0.02;
        double paid = shares * stockPrice;
        double commission = paid * commissionRate;
        double total = paid + commission;
        
        System.out.printf("%nThe amount paid for stock: $%.2f%n", paid);
        System.out.printf("\nCommission amount: $%.2f%n", commission);
        System.out.printf("\nTotal amount paid: $%.2f%n", total);
        
    }
}