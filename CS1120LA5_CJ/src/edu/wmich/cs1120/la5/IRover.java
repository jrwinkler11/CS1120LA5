package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/**
 * Interface for Rover class
 * @author Jake
 */

public interface IRover {
	public ArrayList<IArea> getPath(int startRow, int startCol);
	public void setPath(ArrayList<IArea> path);
	public String getAnalysis();
	public void setAnalysis(String analysis);
	public String toString();
	public void analyzePath();
}
