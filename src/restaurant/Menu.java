package restaurant;

import java.util.Scanner;

/**
 *
 * @author RicaChristineDebuayan
 */
public class Menu {

    //declaring final set of menu for food and drinks as well as their prices
    final String[] foodItems = new String[]{"1. Lechon", "2. Ground Pork", "3. Corned Beef", "4. Pork Siningag", "5. Brown Rice", "6. Plain Rice"};
    final double[] foodItemPrice = new double[]{200, 50, 30, 40, 20, 10};
    final String[] drinkItems = new String[]{"7.  Orange Juice", "8.  Milk Tea", "9.  Water", "10. Pineapple Juice", "11. Gulaman", "12. Coke"};
    final double[] drinkItemPrice = new double[]{15, 50, 10, 15, 20, 20};
    //composition
    private Customer customer;
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Menu() {
        this.customer = new Customer();
    }

    //displays all the foods and drinks together with its respective prices by using for loop
    public void displayMenu() {
        int count = 0;
        System.out.printf("%-32s%-20s|\t%-20s%-20s\n", "FOODS", "PRICE", "DRINKS", "PRICE");
        for (int i = count; i < foodItems.length; ++i) {
            System.out.printf("%-32s%-20s|\t%-20s%-20s\n", foodItems[i], foodItemPrice[i], drinkItems[i], drinkItemPrice[i]);
        }
    }

    //getting information of customer
    public void infoCust() {
        Scanner input= new Scanner(System.in);
        System.out.println(" WELCOME TO RADM - JAVA RESTAURANT!\n");
        System.out.println("May we know our customer's name?\n ");
        System.out.print("First Name: ");
        customer.setFname(input.nextLine());
        System.out.print("Middle Name(enter if none): ");
        customer.setMname(input.nextLine());
        System.out.print("Last Name: ");
        customer.setLname(input.nextLine());
    }

    public void greet() {
        System.out.println("\nGood day day, " + customer.toString() + "!\n");
    }

}
