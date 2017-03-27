package edu.wmich.cs1120.la5;

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
