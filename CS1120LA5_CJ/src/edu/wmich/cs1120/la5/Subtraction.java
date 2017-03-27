package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation {

	public Subtraction() {
	}

	@Override
	public Integer perform(IExpression left, IExpression right) {
		return left.getValue() - right.getValue();
	}

}
