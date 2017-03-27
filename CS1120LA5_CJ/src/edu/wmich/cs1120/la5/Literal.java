package edu.wmich.cs1120.la5;

public class Literal implements IExpression {
	int value;

	public Literal(int value) {
		this.value = value;
	}

	@Override
	public Integer getValue() {
		return value;
	}

}
