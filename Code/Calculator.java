import java.util.Stack;

/**
 * The class Calculator provides a singleton instance and methods to evaluate postfix expressions and
 * convert infix expressions to postfix.
 */
/**
 * The class Calculator provides a singleton instance and a method to evaluate postfix expressions.
 */
class Calculator {
    private static Calculator instance;

    private Calculator() {
    }

    
    /** 
     * @return Calculator
     */
    public static Calculator getInstance() {
        if (instance == null)
            instance = new Calculator();
        return instance;
    }

    public int evaluatePostfix(String expression) {
        return 0;
    }

    public String infixToPostfix(String expr) {
        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();
        
        for (char ch : expr.toCharArray()) {
            if (Character.isDigit(ch)) {
                output.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }
                stack.pop(); // Elimina '(' de la pila
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    output.append(stack.pop());
                }
                stack.push(ch);
            }
        }
    
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
    
        return output.toString();
    }
    
    private int precedence(char ch) {
        switch (ch) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            default: return -1;
        }
    }
}



