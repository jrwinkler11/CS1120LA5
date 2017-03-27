package edu.wmich.cs1120.la5;

/**
 * This class creates BinaryExpression objects which executes the expression using the 2 values and the operation 
 * @author Jake and Chase
 *
 */
public class ExpressionFactory {

	/**
	 * This method executes the expressions
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
