import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Simple Calculator ===");
        boolean running = true;

        while (running) {
            try {
                System.out.print("\nEnter first number (or type 'q' to quit): ");
                String input = sc.next().trim();
                if (input.equalsIgnoreCase("q")) {
                    break;
                }
                double num1 = Double.parseDouble(input);

                System.out.print("Enter second number: ");
                String input2 = sc.next().trim();
                double num2 = Double.parseDouble(input2);

                System.out.println("Choose operation: +  -  *  /");
                System.out.print("Enter operation: ");
                char op = sc.next().trim().charAt(0);

                double result;

                switch (op) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        }
                        break;
                    default:
                        System.out.println("Invalid operation. Please use +, -, *, or /.");
                }

                System.out.print("\nDo you want to perform another operation? (y/n): ");
                String cont = sc.next().trim();
                if (!cont.equalsIgnoreCase("y")) {
                    running = false;
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number input. Please enter a valid number (or 'q' to quit).");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                running = false;
            }
        }

        System.out.println("Calculator closed. Goodbye!");
        sc.close();
    }
}