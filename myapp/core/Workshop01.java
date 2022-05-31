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
        List<String> cart = new LinkedList<String>();

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
                    for (int i = 0; i < cart.size(); i++) {
                        System.out.printf("%d = %s\n", i, cart.get(i));
                    }
                    break;

                case "add":
                    String input = splitString[1];
                    boolean toAdd = true;
                    for (int i = 0; i < cart.size(); i++) {
                        if (input.equals(cart.get(i))) {
                            System.out.printf("You have %s in your cart\n", input);
                            toAdd = false;
                            break;
                        }
                    }
                    ;
                    if (toAdd) {
                        cart.add(input);
                        System.out.printf("%s added to cart\n", input);
                        System.out.printf("Currently your cart has %d items \n", cart.size());
                    } else
                        break;
                    break;

                case "delete":
                    String inputDelete = splitString[1];
                    int index = Integer.parseInt(inputDelete);
                    if (index < cart.size() || index > cart.size()) {
                        System.out.println("Incorrect item index");
                        break;
                    } else {
                        System.out.printf("%s removed from cart\n", cart.get(index));
                        cart.remove(index);
                        System.out.printf("Currently your cart has %d items \n", cart.size());
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