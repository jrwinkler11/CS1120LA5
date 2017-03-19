package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {

	MapCreator mc = new MapCreator();
	ArrayList<IArea> path = new ArrayList<>();
	private String analysis;

	/**
	 * Getter method for MapCreator
	 * 
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

}
