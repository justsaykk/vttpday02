package myapp.core;

// import java.util.Arrays;

public class SumAll {
    public static void main(String[] args) {

        // Convert elements from String to Int
        int[] newArray = new int[args.length];
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            newArray[i] = Integer.parseInt(args[i]);

        }

        for (int i = 0; i < newArray.length; i++) {
            sum += newArray[i];
        }
        System.out.printf("The sum is %d", sum);

    }
}
