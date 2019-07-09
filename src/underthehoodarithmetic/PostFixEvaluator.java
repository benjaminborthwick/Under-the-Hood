package underthehoodarithmetic;

import java.util.Scanner;
import java.util.Stack;

public class PostFixEvaluator {
	public static double evaluate(String expression) {
		Scanner scanner = new Scanner(expression);

		Stack<Double> operands = new Stack<Double>();
		while (scanner.hasNext()) {
			if (scanner.hasNextDouble()) {
				operands.push(scanner.nextDouble());
			} else {

				double operand1 = operands.pop();
				double operand2 = operands.pop();
				switch (scanner.next()) {
				case "+":
					operands.push(operand2 + operand1);
					break;
				case "*":
					operands.push(operand2 * operand1);
					break;
				case "-":
					operands.push(operand2 - operand1);
					break;
				case "/":
					operands.push(operand2 / operand1);
					break;
				case "^":
					operands.push(Math.pow(operand2, operand1));
					break;
				}
			}
		}
		scanner.close();
		return operands.pop();
	}

	public static void main(String[] args) {
		System.out.println("Enter a postfix expression (with tokens separated by spaces)");
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine();
		scanner.close();
		System.out.println(evaluate(inputStr));
	}
}
