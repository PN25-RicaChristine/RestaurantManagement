/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author 1styrGroupB
 */
import java.util.Scanner;

public class Order extends Menu {

    public double subTotal;
    public double totalAmount = 0;
    private double itemPrice;
    private String[] orderList;
    private int[] qtyList;
    private double[] unitPrice;
    private double[] subPrices;
    private double disPrice;
    private double per;
    boolean ordering = true;
    static Scanner input = new Scanner(System.in);
    int q = 0, s = 0, c = 0;

    public Order() {
        int cnt = 50;
        this.orderList = new String[cnt];
        this.qtyList = new int[cnt];
        this.unitPrice = new double[cnt];
        this.subPrices = new double[cnt];
    }

    public void menu() {
        System.out.println("\t\tPlease choose your orders from our menu below:\n");
        super.displayMenu();
        System.out.println("Press '0' if you're done.\n");
    }

    public double itemPrice(int foodItem) {
        if (foodItem == 1) {
            System.out.println("You've ordered " + super.foodItems[0].substring(3, foodItems[0].length()));
            itemPrice = super.foodItemPrice[0];
            orderList[c] = super.foodItems[0].substring(3, foodItems[0].length());
        }
        if (foodItem == 2) {
            System.out.println("You've ordered " + super.foodItems[1].substring(3, foodItems[1].length()));
            itemPrice = super.foodItemPrice[1];
            orderList[c] = super.foodItems[1].substring(3, foodItems[1].length());
        }
        if (foodItem == 3) {
            System.out.println("You've ordered " + super.foodItems[2].substring(3, foodItems[2].length()));
            itemPrice = super.foodItemPrice[2];
            orderList[c] = super.foodItems[2].substring(3, foodItems[2].length());
        }
        if (foodItem == 4) {
            System.out.println("You've ordered " + super.foodItems[3].substring(3, foodItems[3].length()));
            itemPrice = super.foodItemPrice[3];
            orderList[c] = super.foodItems[3].substring(3, foodItems[3].length());
        }
        if (foodItem == 5) {
            System.out.println("You've ordered " + super.foodItems[4].substring(3, foodItems[4].length()));
            itemPrice = super.foodItemPrice[4];
            orderList[c] = super.foodItems[4].substring(3, foodItems[4].length());
        }
        if (foodItem == 6) {
            System.out.println("You've ordered " + super.foodItems[5].substring(3, foodItems[5].length()));
            itemPrice = super.foodItemPrice[5];
            orderList[c] = super.foodItems[5].substring(3, foodItems[5].length());
        }
        if (foodItem == 7) {
            System.out.println("You've ordered " + super.drinkItems[0].substring(3, drinkItems[0].length()));
            itemPrice = super.drinkItemPrice[0];
            orderList[c] = super.drinkItems[0].substring(3, drinkItems[0].length());
        }
        if (foodItem == 8) {
            System.out.println("You've ordered " + super.drinkItems[1].substring(3, drinkItems[1].length()));
            itemPrice = super.drinkItemPrice[1];
            orderList[c] = super.drinkItems[1].substring(3, drinkItems[1].length());
        }
        if (foodItem == 9) {
            System.out.println("You've ordered " + super.drinkItems[2].substring(3, drinkItems[2].length()));
            itemPrice = super.drinkItemPrice[2];
            orderList[c] = super.drinkItems[2].substring(3, drinkItems[2].length());
        }
        if (foodItem == 10) {
            System.out.println("You've ordered " + super.drinkItems[3].substring(3, drinkItems[3].length()));
            itemPrice = super.drinkItemPrice[3];
            orderList[c] = super.drinkItems[3].substring(3, drinkItems[3].length());
        }
        if (foodItem == 11) {
            System.out.println("You've ordered " + super.drinkItems[4].substring(3, drinkItems[4].length()));
            itemPrice = super.drinkItemPrice[4];
            orderList[c] = super.drinkItems[4].substring(3, drinkItems[4].length());
        }
        if (foodItem == 12) {
            System.out.println("You've ordered " + super.drinkItems[5].substring(3, drinkItems[5].length()));
            itemPrice = super.drinkItemPrice[5];
            orderList[c] = super.drinkItems[5].substring(3, drinkItems[5].length());
        }
        unitPrice[c] = itemPrice;
        c++;
        quantity();
        System.out.println("");
        return itemPrice;
    }

    public int quantity() {
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        subTotal(quantity, itemPrice);
        qtyList[q] = quantity;
        q++;
        return quantity;
    }

    public double subTotal(int quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        totalAmount += subTotal;
        System.out.println("Subtotal: " + subTotal);
        subPrices[s] = subTotal;
        s++;
        return subTotal;
    }

    public void done(double totalAmount) {
        ordering = false;
        if (discount() == true) {
            System.out.printf("\nThank you for ordering atleast 10 items!\nThe total amount of your orders is now Php %.2f .", disPrice);
        } else {
            System.out.printf("\nThank you for ordering!\nThe total amount of your orders is Php %.2f .", totalAmount);
        }
        System.out.println("\nEnjoy your meal!!!");
    }

    public void receipt() {
        int count = 0;
        System.out.println("\n----------------------------------------------------------------------------------------------");
        System.out.printf("\n\t\t\tHere is a copy of your order...\n%-20s|%-15s|%-20s|%-5s\n", "ORDERED ITEMS", "UNIT PRICE", "QUANTITY", "AMOUNT TOTAL");
        for (int i = count; i < c; ++i) {
            System.out.printf("%-20s|%-15.2f|%-20s|\t%-5.2f\n", orderList[i], unitPrice[i], qtyList[i], subPrices[i]);
        }
        if (discount() == true) {
            System.out.printf("\n\t\t\t\t\t\tORIGINAL AMOUNT: Php %.2f", totalAmount);
            System.out.printf("\n\t\t\t\t\t\tDISCOUNT 10%%: Php %.2f",per);
            System.out.printf("\n\t\t\t\t\t\tTOTAL AMOUNT: Php %.2f", disPrice);
        } else {
            System.out.printf("\n\t\t\t\t\t\tTOTAL AMOUNT: Php %.2f", totalAmount);
        }
        System.out.println("\n----------------------------------------------------------------------------------------------");

    }

    public boolean discount() {
        this.disPrice = totalAmount;
        int total = 0;
        for (int i = 0; i < q; ++i) {
            total += qtyList[i];
        }

        if (total >= 10) {
            per = disPrice * 0.10;
            disPrice -= per;
            return true;
        }
        return false;
    }

}
