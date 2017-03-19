package edu.wmich.cs1120.la5;

public class Addition implements IOperation {
	IExpression exp1, exp2;

	public Addition(IExpression exp1, IExpression exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	public Integer perform(IExpression left, IExpression right) {
		return left.getValue() + right.getValue();
	}
}
