package edu.wmich.cs1120.la5;

/**
 * Interface for Area class
 * @author Jake
 */

public interface IArea {
	double getBasicEnergyCost();
	void setBasicEnergyCost(double basicEnergyCost);
	double getElevation();
	void setElevation(double elevation);
	double getRadiation();
	void setRadiation(double radiation);
	double calcConsumedEnergy();
}