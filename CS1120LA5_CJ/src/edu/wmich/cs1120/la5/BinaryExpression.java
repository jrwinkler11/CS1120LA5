package edu.wmich.cs1120.la5;


/**
 * This class implements the IExpression interface and creates the completed Binary Expression used by ExpressionFactory
 * @author Jake and Chase
 *
 */
public class BinaryExpression implements IExpression {
	IExpression left, right;
	IOperation op;

	public BinaryExpression(IExpression left, IExpression right, IOperation op) {
		this.left = left;
		this.right = right;
		this.op = op;
	}

	@Override
	public Integer getValue() {
		return op.perform(left, right);
	}
}
