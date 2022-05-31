// Package Declaration
package myapp.core;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("good morning");

        // Instantiate array
        String[] todos = new String[3];

        todos[0] = "Learn Array";
        todos[1] = "Learn for-loops";
        todos[2] = "Learn while-loops";

        System.out.printf("Index: %d has the value of %s\n", 0, todos[0]);
        System.out.printf("Index: %d has the value of %s\n", 1, todos[1]);
        System.out.printf("Index: %d has the value of %s\n", 2, todos[2]);

        // Print out length of Array
        System.out.printf("Length of array is = %d\n", todos.length);

    }
}