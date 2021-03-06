package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/**
 * This class uses the IRover interface and analyzes the radiation of an area
 * @author Jake
 *
 */
public class RadiationAnalyzer implements IRover {

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
		double totalRadiation = 0;
		for (int i = 0; i < path.size(); i++) {
			totalRadiation = totalRadiation + path.get(i).getRadiation();
		}
		this.setAnalysis("Radiation: " + totalRadiation);
	}
	
	@Override
	public String toString() {
		return "Radiation Information:";
	}

}