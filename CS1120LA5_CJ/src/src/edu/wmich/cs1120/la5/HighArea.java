package src.edu.wmich.cs1120.la5;

/**
 * Subclass of Area class, uses more energy than LowArea
 * @author Jake
 */

public class HighArea extends Area {
	public double calcConsumedEnergy() {
		return basicEnergyCost * 4;
	}
}
