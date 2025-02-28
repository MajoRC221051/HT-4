import java.util.Scanner;

/**
 * This Java class takes an infix expression as input, converts it to postfix notation, evaluates the
 * postfix expression, and displays the result.
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter infix expression: ");
            String infix = scanner.nextLine();
            Calculator calculator = Calculator.getInstance();
            String postfix = calculator.infixToPostfix(infix);
            int result = calculator.evaluatePostfix(postfix);
            System.out.println("Postfix: " + postfix);
            System.out.println("Result: " + result);
        }
    }
} 