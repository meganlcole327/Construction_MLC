
public class SingleFamilyHome extends Residential{
	
	private boolean garage;
	
	public SingleFamilyHome(){
		super();
		this.garage = false;
	} //end empty-argument constructor
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage){
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.garage = garage;
	} //end preferred constructor
	
	//Getters and Setters

	public boolean isGarage() {
		return garage;
	} //end isGarage

	public void setGarage(boolean garage) {
		this.garage = garage;
	} //end setGarage

	@Override
	public String toString() { 
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
						+ laundryRoom + "SingleFamilyHome [garage=" + garage + "]";	
		
	} //end toString


} //end class
