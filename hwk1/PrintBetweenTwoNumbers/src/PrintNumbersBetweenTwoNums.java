import java.util.Scanner;

public class PrintOddNumbersBetweenTwoNums {
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

        // Print odd numbers between a and b
        printOddNumbersBetweenTwoNums(a, b);
    }

    static void printOddNumbersBetweenTwoNums(int a, int b) {
        // Print odd numbers between a and b
        for (int i = a + 1; i < b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        // Add a new line for better formatting
        System.out.println();
    }
}
