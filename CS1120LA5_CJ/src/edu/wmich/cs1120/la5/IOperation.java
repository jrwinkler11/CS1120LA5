package edu.wmich.cs1120.la5;

public interface IOperation {

	
	/**
	 * perform the operation accordingly and return the value
	 * 
	 * @param left expression
	 * @param right expression
	 * @return value of operation on expressions
	 */
	public Integer perform(IExpression left, IExpression right);
	
}
