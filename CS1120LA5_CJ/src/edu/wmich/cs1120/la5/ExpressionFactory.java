package edu.wmich.cs1120.la5;

public class ExpressionFactory {

	/**
	 * Reads file using Binary
	 * 
	 * @param operator
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static IExpression getExpression(char operator, int val1, int val2) {
		if (operator == '+') {
			return  new BinaryExpression(new Literal(val1), new Literal(val2), new Addition());
		} else {
			return  new BinaryExpression(new Literal(val1), new Literal(val2), new Subtraction());

		}
	}

}
