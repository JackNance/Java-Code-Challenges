package exercises;

public class ArithmeticValidExpression {

	public static void main(String[] args) {
		String expression1 = "(a + b)";
		String expression2 = " 1(+ 5";
		String expression3 = "5 *1/2-9+5*(1 + 5)";
		String expression4 = "5 *1/2-9+5*(1 + 5)(";
		
		System.out.println(expression1 + ": " + isValidExpression(expression1));
		System.out.println(expression2 + ": " + isValidExpression(expression2));
		System.out.println(expression3 + ": " + isValidExpression(expression3));
		System.out.println(expression4 + ": " + isValidExpression(expression4));

	}
	
	public static boolean isAnOperator(char c) {
		return (c == '*' || c == '/' || c == '+' || c == '-' || c == '%');
	}

	/**
	 * Checks position and placement of (, ), and operators in a string to make sure
	 * it is a valid arithmetic expression
	 * 
	 * @param expression
	 * @return true if the string is a valid arithmetic expression, false if not
	 */
	private static boolean isValidExpression(String expression) {
		// remove unnecessary whitespaces
		expression = expression.replaceAll("\\s+", "");
		// TEST 1: False if expression starts or ends with an operator
		if (isAnOperator(expression.charAt(0)) || isAnOperator(expression.charAt(expression.length() - 1)))
			return false;
		// System.out.println("Does not start or end with operator");

		// TEST 2: False if test has mismatching number of opening and closing
		// parantheses

		int unclosedParenthesis = 0;
		// System.out.println("Parentheses counter initialized to 0");

		for (int i = 0; i < expression.length(); i++) {
			// System.out.println("For loop count: " + i);
			if (expression.charAt(i) == '(') {
				// System.out.println("( found");
				unclosedParenthesis++;
				// SUBTEST: False if expression ends with '('
				if (i == expression.length() - 1)
					return false;
			}
			if (expression.charAt(i) == ')') {
				unclosedParenthesis--;
				// System.out.println(") found");
				// SUBTEST: False if expression starts with ')'
				if (i == 0)
					return false;

			}
			if (isAnOperator(expression.charAt(i))) {

				// System.out.println("Found an Operator");
				// TEST 3: False if operator is preceded by an operator or opening paranthesis
				// or followed by closing paranthesis
				if (expression.charAt(i - 1) == '(' || expression.charAt(i + 1) == ')'
						|| isAnOperator(expression.charAt(i + 1))) {
					// System.out.println("Found wrongly preceding or following parenthesis to
					// operator");
					// System.out.println("or Found an operator following another operator");
					return false;
				}

			}

		}
		return (unclosedParenthesis == 0);
	}
}
