package edu.wmich.cs1120.la5;

/**
 * This class is used by IOperation to add two Expression literals
 * @author Jake and Chase
 *
 */
public class Addition implements IOperation {

	public Addition() {
	}

	@Override
	public Integer perform(IExpression left, IExpression right) {
		return left.getValue() + right.getValue();
	}
}
