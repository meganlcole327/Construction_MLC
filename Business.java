
public class Business extends Building{
	
	protected int numRentableUnits;
	
	public Business(){
		super();
		this.numRentableUnits = 0; //not sure what to set this to
	} //end empty-argument constructor
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits){
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
	} //end preferred constructor
	
	//Getters and Setters
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	} //end getNumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	} //end setNumRentableUnits

	@Override
	public String toString() { 
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "numRentableUnits=" + numRentableUnits + "]" ;
	} //end toString

} //end class
