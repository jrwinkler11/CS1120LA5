package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation {
	IExpression exp1, exp2;

	public Subtraction(IExpression exp1, IExpression exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	public Integer perform(IExpression left, IExpression right) {
		return left.getValue() - right.getValue();
	}

}
