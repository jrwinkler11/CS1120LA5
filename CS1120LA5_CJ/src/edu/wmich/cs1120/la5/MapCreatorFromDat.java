package edu.wmich.cs1120.la5;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * This class utilizes RandomAccessFile to read a binary dat file and create an
 * object map
 * 
 * @author Jake and Chase
 *
 */
public class MapCreatorFromDat implements IMapCreator {

	TerrainScanner scanner = new TerrainScanner();

	/**
	 * This method reads the dat file and creates a 2D array of Area objects
	 * (either high or low)
	 * 
	 * @param fileName
	 *            string for the filename from user
	 * @param threshold
	 *            int for the threshold from user
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {
		Area[][] objectMap = new Area[10][10];

		boolean endOfFile = false;
		RandomAccessFile randomFile = new RandomAccessFile(fileName, "r");

		double energyCost = randomFile.readDouble();
		double elevation = randomFile.readDouble();
		double radiation = randomFile.readDouble();
		char ch = randomFile.readChar();
		int value1 = randomFile.readInt();
		int value2 = randomFile.readInt();
		IExpression expression = ExpressionFactory.getExpression(ch, value1, value2);
		Integer value = expression.getValue();

		// while (value != -1) {
		// randomFile.seek(value * 3);
		//
		// energyCost = randomFile.readDouble();
		// elevation = randomFile.readDouble();
		// radiation = randomFile.readDouble();
		//
		// ch = randomFile.readChar();
		// result += ch;
		// value1 = randomFile.readInt();
		// value2 = randomFile.readInt();
		// expression = ExpressionFactory.getExpression(ch, value1, value2);
		// value = expression.getValue();
		//
		//
		// }

		mainLoop: for (int r = 0; r < 10; r++) {
			for (int c = 0; c < 10; c++) {
				if (endOfFile)
					break mainLoop;

				try {
					
					if (value <= -1)
						break mainLoop;
					randomFile.seek(value * (Double.BYTES * 3) + (Integer.BYTES * 2) + Character.BYTES);

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

		// inputFile.close();

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