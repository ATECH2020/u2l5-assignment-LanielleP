import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        //makes new Scanner
        Scanner in = new Scanner(System.in);

        //sets costs provided in instructions
        double lumberCost = 8;
        double windowCost = 11;

        //gets user input for tax, boards
        System.out.println("Enter the sales tax rate: ");
        double tax = in.nextDouble();
        System.out.println("How many boards do you need?");
        int boards = in.nextInt();
        System.out.println("How many windows do you need?");
        int windows = in.nextInt();

        //calculates total cost
        Construction construction = new Construction(lumberCost, windowCost, tax);
        double totalLumberCost = construction.lumberCost(boards);
        double totalWindowCost = construction.windowCost(windows);
        double total = totalLumberCost + totalWindowCost;

        //prints total and grand total
        System.out.println("Total: "+total);
        System.out.println("Grand Total: "+construction.grandTotal(total));
    }
}
