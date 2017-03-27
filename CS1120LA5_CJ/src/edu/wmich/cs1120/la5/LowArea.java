package edu.wmich.cs1120.la5;

/**
 * Subclass of Area class, uses less energy than HighArea
 * @author Jake and Chase
 * 
 */

public class LowArea extends Area {
	public double calcConsumedEnergy() {
		return basicEnergyCost * 2;
	}
}
