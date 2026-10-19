import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost = 0;
        double totalPrice = 0;
        String trash = "";

        System.out.print("Enter the item price: ");

        if (in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= 100)
            {
                shippingCost = 0;
            }
            else
            {
                shippingCost = itemPrice * 0.02;
            }

            totalPrice = itemPrice + shippingCost;

            System.out.printf("Shipping cost: $%.2f%n", shippingCost);
            System.out.printf("Total price: $%.2f%n", totalPrice);
        }
        else
        {
            trash = in.nextLine();

            System.out.println("You entered: " + trash);
            System.out.println("Run the program again and enter a valid price!");
        }

        in.close();
    }
}