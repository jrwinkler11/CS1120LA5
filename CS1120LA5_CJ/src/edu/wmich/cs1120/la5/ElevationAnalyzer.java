package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/**
 * This class uses the IRover interface and analyzes the elevation of an area
 * @author Jake and Chase
 *
 */
public class ElevationAnalyzer implements IRover {

	ArrayList<IArea> path = new ArrayList<>();
	private String analysis;


	/**
	 * Getter method for solution path
	 * 
	 * @return ArrayList<Area>
	 */
	public ArrayList<IArea> getPath(int startRow, int startCol) {
		return this.path;
	}

	/**
	 * Setter method for solution path using MapCreator
	 */
	public void setPath(ArrayList<IArea> path) {
		this.path = path;
	}

	@Override
	public String getAnalysis() {
		return analysis;
	}

	@Override
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}
	
	@Override
	public void analyzePath() {
		double elevation = 0;
		for (int i = 0; i < path.size(); i++) {
			elevation = elevation + path.get(i).getElevation();
		}
		this.setAnalysis("Elevation: " + elevation);
	}
	
	@Override
	public String toString() {
		return "Elevation Information:";
	}
}
