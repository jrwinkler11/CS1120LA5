package edu.wmich.cs1120.la5;

/**
 * Area class constructs Area objects which are used my the MapCreator class
 * @author Jake and Chase
 */

public class Area implements IArea {
	double basicEnergyCost;
	double elevation;
	double radiation;
	 
	/**
	 * Getter method to get the basic energy cost of the area
	 * @return basicEnergyCost
	 */
	public double getBasicEnergyCost() {
		return this.basicEnergyCost;
	}
	
	/**
	 * Setter method for basic energy cost
	 * @param basicEnergyCost value for setting the energy cost
	 */
	public void setBasicEnergyCost(double basicEnergyCost) {
		this.basicEnergyCost = basicEnergyCost;
	}
	
	/**
	 * Getter method to get the elevation of the area
	 * @return elevation
	 */
	public double getElevation() {
		return this.elevation;
	}
	
	/**
	 * Setter method for elevation
	 * @param elevation value for setting the elevation
	 */
	public void setElevation(double elevation) {
		this.elevation = elevation;
	}
	
	/**
	 * Getter method to get the radiation of the area
	 * @return radiation
	 */
	public double getRadiation() {
		return this.radiation;
	}
	
	/**
	 * Setter method for the radiation
	 * @param radiation value for setting the radiation
	 */
	public void setRadiation(double radiation) {
		this.radiation = radiation;
	}

	/**
	 * Method for calculating the energy consumed, overriden by the sub classes HighArea and LowArea 
	 * @return 0
	 */
	public double calcConsumedEnergy() {
		return 0;
	}
}
