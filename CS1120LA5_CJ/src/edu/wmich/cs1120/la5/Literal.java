package edu.wmich.cs1120.la5;

/**
 * This class is for creating Literal objects that hold values for expressions
 * @author Jake and Chase
 *
 */
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
