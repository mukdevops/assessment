package org.example.test;
import java.util.*;

public class DiscountDistribution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read input size
        int numOfProducts = in.nextInt();
        int[] order = new int[numOfProducts];

        // Read order array
        for (int i = 0; i < numOfProducts; i++) {
            order[i] = in.nextInt();
        }

        // Read discount amount
        int disAmount = in.nextInt();

        // Get and print result
        int result = noOfProducts(order, disAmount);
        System.out.println(result);
    }

    public static int noOfProducts(int[] order, int disAmount) {
        Arrays.sort(order); // Sort in ascending order to allocate the smallest first
        int count = 0;

        for (int i = 0; i < order.length; i++) {
            if (disAmount >= order[i]) {
                disAmount -= order[i]; // Deduct the allocated discount
                count++; // Increase the count of fully discounted products
            } else {
                break; // If discount is not enough for the next item, stop
            }
        }
        return count; // Return total product types that received discount
    }
}
