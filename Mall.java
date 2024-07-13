
public class Mall extends Business{
	
	private int numRentedUnits; //do I need if referring to Business class
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall(){
		super();
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
		this.numParkingSpaces = 0;
	} //end empty-argument constructor

	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits, int numRentedUnits, int medianUnitSize, int numParkingSpaces){
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentedUnits);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	} //end preferred constructor
	
	//Getters and Setters
	
	public int getNumRentedUnits() {
		return numRentedUnits;
	} //end getNumRentedUnits

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	} //end setNumRentedUnits

	public double getMedianUnitSize() {
		return medianUnitSize;
	} //end getMedianUnitSize

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	} //end setMedianUnitSize

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	} //end getNumParkingSpaces

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	} //end setNumParkingSpaces

	@Override
	public String toString() { 
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup +"Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]";
	} //end toString

	
} //end class
