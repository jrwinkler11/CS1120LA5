package edu.wmich.cs1120.la5;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class MapCreatorFromDat implements IMapCreator {

	TerrainScanner scanner = new TerrainScanner();

	/**
	 * This method reads the text file and creates a 2D array of Area objects
	 * (either high or low)
	 * 
	 * @param fileName
	 *            string for the filename from user
	 * @param threshold
	 *            int for the threshold from user
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {
		Scanner inputFile = new Scanner(new File(fileName));

		Area[][] objectMap = new Area[10][10];

		boolean endOfFile = false;
		DataInputStream input = new DataInputStream(new FileInputStream(fileName));

		mainLoop: for (int r = 0; r < 10; r++) {
			for (int c = 0; c < 10; c++) {
				if (endOfFile)
					break mainLoop;

				try {
					double energyCost = input.readDouble();
					double elevation = input.readDouble();
					double radiation = input.readDouble();
					char opperator = input.readChar();
					int val1 = input.readInt();
					int val2 = input.readInt();

					if (radiation >= 0.5 || (elevation > threshold * .5)) {
						Area a = new HighArea();
						a.setBasicEnergyCost(energyCost);
						a.setElevation(elevation);
						a.setRadiation(radiation);
						objectMap[r][c] = a;
					} else {
						Area a = new LowArea();
						a.setBasicEnergyCost(energyCost);
						a.setElevation(elevation);
						a.setRadiation(radiation);
						objectMap[r][c] = a;
					}
				} catch (EOFException e) {
					endOfFile = true;
				}
			}

		}
		System.out.println("\nDone.");
		scanner.setTerrain(objectMap);

		inputFile.close();

	}

	/**
	 * Getter method for TerrainScanner
	 * 
	 * @return TerrainScanner
	 */
	public TerrainScanner getScanner() {
		return this.scanner;
	}

	/**
	 * Setter method for TerrainScanner
	 * 
	 * @param scanner
	 *            TerrainScanner object
	 */
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;
	}
}