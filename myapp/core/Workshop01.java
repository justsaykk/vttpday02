// Package Declaration
package myapp.core;

import java.io.Console;
import java.util.*;

/**
 * Workshop01
 */
public class Workshop01 {

    public static void main(String[] args) {
        Console cons = System.console();
        // Welcome Statement
        System.out.println("Welcome to your shopping cart");

        // Declare an empty variable to hold cart items
        List<String> cart = new ArrayList<>();

        System.out.printf("Currently your cart has %d items \n", cart.size());
        // Create overarching while loop
        boolean stop = false; // while-loop control statement
        while (!stop) {
            String userInput = cons.readLine("");
            String[] splitString = userInput.split(" "); // output: ["add", "apple"]
            String userCommand = splitString[0].toLowerCase(); // output: "add"

            // User input Handlers
            switch (userCommand) {
                case "list":
                    if (cart.size() > 0) {
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.printf("%d. %s\n", (i + 1), cart.get(i));
                        }
                    } else {
                        System.out.println("Your cart is empty\n");
                    }
                    break;

                case "add":
                    String input = splitString[1];
                    boolean found = false;
                    for (int i = 0; i < cart.size(); i++) {
                        if (input.equals(cart.get(i))) {
                            System.out.printf("You have %s in your cart\n", input);
                            found = true;
                            break;
                        }
                    }
                    ;
                    if (!found) {
                        cart.add(input);
                        System.out.printf("%s added to cart\n", input);
                    } else
                        break;
                    break;

                case "delete":
                    int index = Integer.parseInt(splitString[1]) - 1;
                    if (index > cart.size()) {
                        System.out.println("Incorrect item index");
                    } else {
                        System.out.printf("%s removed from cart\n", cart.get(index));
                        cart.remove(index);
                    }
                    break;

                case "":
                    System.out.println("Thank you for shopping with us.\n");
                    stop = true; // Stopping the while-loop

                default:
                    System.out.println("\n");
            }

        }
        ;

    }
}