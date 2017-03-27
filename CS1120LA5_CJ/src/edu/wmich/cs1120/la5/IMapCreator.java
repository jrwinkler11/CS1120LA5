package edu.wmich.cs1120.la5;

import java.io.IOException;
import edu.wmich.cs1120.la5.TerrainScanner;

/**
 * Interface for MapCreator class
 * @author Jake and Chase
 *
 */

public interface IMapCreator {
	public void scanTerrain(String fileName, int threshold) throws IOException;
	public TerrainScanner getScanner();
	public void setScanner(TerrainScanner scanner);
}
