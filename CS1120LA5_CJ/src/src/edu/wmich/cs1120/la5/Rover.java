package src.edu.wmich.cs1120.la5;

import java.util.ArrayList;

/**
 * Rover class that finds a path and calculates the energy used on the path
 * @author Jake
 */

public class Rover implements IRover {

	MapCreator mc = new MapCreator();
	ArrayList<Area> path = new ArrayList<Area>();
	
	
	/**
	 * Getter method for MapCreator
	 * @return MapCreator 
	 */
	public MapCreator getMapCreator() {
		return this.mc;
	}


	/**
	 * Setter method for MapCreator
	 */
	public void setMapCreator(MapCreator mc) {
		this.mc = mc;
	}

	/**
	 * Getter method for solution path
	 * @return ArrayList<Area> 
	 */
	public ArrayList<Area> getPath(int startRow, int startCol) {
		return this.path;
	}

	
	/**
	 * Setter method for solution path using MapCreator
	 */
	public void setPath(int startRow, int startCol) {
		this.path = mc.getScanner().getPath(startRow,startCol);
	}

	/**
	 * Method that calculates the energy for each area in the path
	 * @return totalEnergy returns the total energy for the trip
	 */ 
	public double calculateEnergy() {
		double totalEnergy= 0;
		for (int i = 0; i < path.size(); i++) {
			totalEnergy = totalEnergy + path.get(i).calcConsumedEnergy();
		}
		return totalEnergy;
	}

}
