package edu.wmich.cs1120.la5;

public class Literal implements IExpression {
	int num1, num2 = 0;

	public Literal(int val1, int val2) {
		num1 = val1;
		num2 = val2;
	}

	@Override
	public Integer getValue() {
		return num1 + num2;
	}

}
