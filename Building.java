
public class Building {
	
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	public Building(){
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupancyGroup = "";
		this.subgroup = "";
	} //end empty-argument constructor
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup){
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	} //end preferred constructor
	
	//Getters and Setters
	
	public String getProjectName() {
		return projectName;
	} //end getProjectName

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	} //end getProjectName

	public String getCompleteAddress() {
		return completeAddress;
	} //end getCompleteAddress

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	} //end setCompleteAddress

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	} //end getTotalSquareFeet

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	} //end setTotalSquareFeet

	public String getOccupancyGroup() {
		return occupancyGroup;
	} //end getOccupancyGroup

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	} //end setOccupancyGroup

	public String getSubgroup() {
		return subgroup;
	} //end getSubgroup

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	} //end setSubgroup

	public void draw() { 
		System.out.println("Drawing code for " + this.getClass().getName());
	} //end draw
	
	@Override
	public String toString() { 
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	} //end toString
	
	public void displayData() {
		System.out.print(toString());
	} //end displayData

} //end class
