package edu.wmich.cs1120.la5;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import edu.wmich.cs1120.la5.TerrainScanner;

/**
 * MapCreator class that uses Area objects to get input from a file and generate a map using TerrainScanner
 * @author Jake
 */

public class MapCreator implements IMapCreator {
	
	TerrainScanner scanner = new TerrainScanner();

	/**
	 * This method reads the text file and creates a 2D array of Area objects (either high or low)
	 * @param fileName string for the filename from user
	 * @param threshold int for the threshold from user
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {
		 Scanner inputFile = new Scanner(new File(fileName));
		 double basicEnergy;
		 double elevation;
		 double radiation;
		 Area[][] objectMap = new Area[10][10];
		 
		 
		 for (int r = 0; r < 10; r++) {
			 for (int c = 0; c < 10; c++) {
				 String inputLine = inputFile.nextLine();
				 
				 String[] split = inputLine.split("\\s");
				 
				 basicEnergy = Double.parseDouble(split[0]);
				 elevation = Double.parseDouble(split[1]);
				 radiation = Double.parseDouble(split[2]);
				 
				 if (radiation >= 0.5 || (elevation > threshold * .5)) {
					 Area a = new HighArea();
					 a.setBasicEnergyCost(basicEnergy);
					 a.setElevation(elevation);
					 a.setRadiation(radiation);
					 objectMap[r][c] = a;
				 }
				 else {
					 Area a = new LowArea();
					 a.setBasicEnergyCost(basicEnergy);
					 a.setElevation(elevation);
					 a.setRadiation(radiation);
					 objectMap[r][c] = a;
				 }
			 }
		 }
		 
		 
		 scanner.setTerrain(objectMap);
		 
		 inputFile.close();
		 
	}
	
	/**
	 * Getter method for TerrainScanner
	 * @return TerrainScanner
	 */
	public TerrainScanner getScanner() {
		return this.scanner;
	}

	/**
	 * Setter method for TerrainScanner
	 * @param scanner TerrainScanner object
	 */
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;
	}

}
