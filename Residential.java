
public class Residential extends Building {
	
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential(){
		super();
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false; //do I set to false
	} //end empty-argument constructor
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom){
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	} //end preferred constructor
	
	//Getters and Setters

	public int getNumBedrooms() {
		return numBedrooms;
	} //end getNumBedrooms

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	} //end setNumBedrooms

	public int getNumBathrooms() {
		return numBathrooms;
	} //end getNumBathrooms

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	} //end setNumBathrooms

	public boolean isLaundryRoom() {
		return laundryRoom;
	} //end isLaundryRoom

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	} //end laundryRoom

	@Override
	public String toString() { 
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
						+ laundryRoom + "]";
	} //end toString
	
	

} //end class
