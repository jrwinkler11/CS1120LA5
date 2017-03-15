package src.edu.wmich.cs1120.la5;

import java.util.ArrayList;

/**
 * Interface for Rover class
 * @author Jake
 */

public interface IRover {
	public MapCreator getMapCreator();
	public void setMapCreator(MapCreator mc);
	public ArrayList<Area> getPath(int startRow, int startCol);
	public void setPath(int startRow, int startCol);
	public double calculateEnergy();
}
