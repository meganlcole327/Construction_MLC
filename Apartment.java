
public class Apartment extends Residential{
	
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvaliable;
	
	public Apartment(){
		super();
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvaliable = false;
	} //end empty-argument constructor
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvaliable){
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvaliable = parkingAvaliable;
	} //end preferred constructor 
	
	//Getters and Setters
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	} //end getNumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	} //end setNumRentableUnits

	public double getAvgUnitSize() {
		return avgUnitSize;
	} //end getAvgUnitSize

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	} //end setAvgUnitSize

	public boolean isParkingAvaliable() {
		return parkingAvaliable;
	} //end isParkingAvaliable

	public void setParkingAvaliable(boolean parkingAvaliable) {
		this.parkingAvaliable = parkingAvaliable;
	} //end setParkingAvaliable

	@Override
	public String toString() { 
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
						+ laundryRoom + "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
						+ ", parkingAvaliable=" + parkingAvaliable + "]"; 
	} //end toString


} //end class
