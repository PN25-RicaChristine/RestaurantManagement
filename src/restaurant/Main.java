/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.Scanner;
import static restaurant.Order.input;

/**
 *
 * @author RicaChristineDebuayan
 */
public class Main {

    public static void main(String[] args) {
        
        Order o = new Order();
        o.infoCust();
        o.greet();
        o.menu();
        int menuOption;
        int foodItem;
        input = new Scanner(System.in);
        do {
            System.out.print("Enter item no: ");
            menuOption = input.nextInt();
            switch (menuOption) {
                case 1:
                    foodItem = 1;
                    o.itemPrice(foodItem);
                    break;
                case 2:
                    foodItem = 2;
                    o.itemPrice(foodItem);
                    break;
                case 3:
                    foodItem = 3;
                    o.itemPrice(foodItem);
                    break;
                case 4:
                    foodItem = 4;
                    o.itemPrice(foodItem);
                    break;
                case 5:
                    foodItem = 5;
                    o.itemPrice(foodItem);
                    break;
                case 6:
                    foodItem = 6;
                    o.itemPrice(foodItem);
                    break;
                case 7:
                    foodItem = 7;
                    o.itemPrice(foodItem);
                    break;
                case 8:
                    foodItem = 8;
                    o.itemPrice(foodItem);
                    break;
                case 9:
                    foodItem = 9;
                    o.itemPrice(foodItem);
                    break;
                case 10:
                    foodItem = 10;
                    o.itemPrice(foodItem);
                    break;
                case 11:
                    foodItem = 11;
                    o.itemPrice(foodItem);
                    break;
                case 12:
                    foodItem = 12;
                    o.itemPrice(foodItem);
                    break;
                case 0:
                    o.done(o.totalAmount);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (o.ordering);
        o.receipt();
    }

}
