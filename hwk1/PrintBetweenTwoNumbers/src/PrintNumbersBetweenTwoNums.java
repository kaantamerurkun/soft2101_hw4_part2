/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author urkun
 */
import java.util.Scanner;

public class PrintNumbersBetweenTwoNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        // Input second number
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Validate if a is less than b
        if (a >= b) {
            System.out.println("Invalid input. The first number should be less than the second number.");
            return;
        }

        // Print numbers between a and b
        printNumbersBetweenTwoNums(a, b);
    }

    static void printNumbersBetweenTwoNums(int a, int b) {
        // Print numbers between a and b
        for (int i = a + 1; i < b; i++) {
            System.out.print(i + " ");
        }

        // Add a new line for better formatting
        System.out.println();
    }
}