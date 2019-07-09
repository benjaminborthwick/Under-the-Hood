package underthehoodarithmetic;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ShuntingYard {

	public String[][] opsByPrecedence = { { "+", "-" }, { "*", "/" }, { "^" } };
	public String[] rightAssociativeOps = { "^" };

	private boolean isOp(String s) {
		for (int i = 0; i < opsByPrecedence.length; i++) {
			for (int j = 0; j < opsByPrecedence[i].length; j++) {
				if (s.contentEquals(opsByPrecedence[i][j])) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isRightAssociative(String op) {
		for (int i = 0; i < rightAssociativeOps.length; i++) {
			if (op.equals(rightAssociativeOps[i])) {
				return true;
			}
		}
		return false;
	}

	private int getPrecedence(String op) {
		for (int i = 0; i < opsByPrecedence.length; i++) {
			for (int j = 0; j < opsByPrecedence[i].length; j++) {
				if (op.equals(opsByPrecedence[i][j])) {
					return i;
				}
			}
		}
		throw new RuntimeException("Invalid op specified (" + op + ") - Watch what you're doing");
	}

	public String toPostFix(String expression) {
		Stack<String> ops = new Stack<String>();
		String[] tokens = expression.split(" ");
		String postfix = "";
		for (int i = 0; i < tokens.length; i++) {
			Boolean isOperatorAdded = false;
			Boolean isParentheses = false;
			if (isOp(tokens[i])) {
				int precedence = getPrecedence(tokens[i]);
				while (!isOperatorAdded) {
					if (ops.isEmpty() || ops.peek().equals("(") || (precedence > getPrecedence(ops.peek())
							|| (precedence == getPrecedence(ops.peek()) && isRightAssociative(tokens[i])))) {
						ops.push(tokens[i]);
						System.out.println("Pushed " + tokens[i] + "to stack with precedence " + precedence);
						isOperatorAdded = true;
					} else if (precedence < getPrecedence(ops.peek())
							|| (precedence == getPrecedence(ops.peek()) && !isRightAssociative(tokens[i]))) {
						String tempOp = ops.pop();
						postfix += tempOp + " ";
						System.out.println("Popped " + tempOp + " into the string");
					}
				}
			} else if (tokens[i].equals("(")) {
				ops.push(tokens[i]);
			} else if (tokens[i].equals(")")) {
				System.out.println("I should be emptying now");
				while (!ops.peek().contentEquals("(")) {
					System.out.println("I should be emptying now");
					System.out.println("Popping " + ops.peek());
					postfix += ops.pop() + " ";
					System.out.println("Next up: " + ops.peek());
				}
				ops.pop();
			} else {
				postfix += tokens[i] + " ";
			}
		}
		while(!ops.isEmpty()) {
			postfix += ops.pop() + " ";
		}
		return postfix;

	}

	public static void main(String[] args) {
		System.out.println("Enter an infix expression to convert to post-fix form");
		Scanner scanner = new Scanner(System.in);
		String infixString = scanner.nextLine();
		scanner.close();

		ShuntingYard sy = new ShuntingYard();
		String postFix = sy.toPostFix(infixString);
		System.out.println(postFix);
		System.out.println(PostFixEvaluator.evaluate(postFix));
	}

}
