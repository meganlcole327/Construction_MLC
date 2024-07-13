
public class Application {

	public static void main(String[] args) {
		//Building Class
		Building build = new Building("Gaines House", "123 Main Street, Louisville, Kentucky 40201", 2540, "Residential", "Group R-1");
		System.out.println("Building Class: \nProject name: " + build.getProjectName()); //setters and getters
		System.out.println("Complete address: " + build.getCompleteAddress());
		System.out.println("Square Feet: " + build.getTotalSquareFeet());
		System.out.println("Occupancy Group: " + build.getOccupancyGroup());
		System.out.println("Occupancy Subgroup: " + build.getSubgroup());
		System.out.println(build.toString()); //toString
		
		System.out.println("==============================");
		
		//Business Class
		Business bus = new Business("Chick-Fil-A", "234 Springhurst Drive,  Louisville, Kentucky 40201", 5020, "Business", "Group B", 0);
		System.out.println("Business Class: \nProject name: " + bus.getProjectName()); //setters and getters
		System.out.println("Complete address: " + bus.getCompleteAddress());
		System.out.println("Square Feet: " + bus.getTotalSquareFeet());
		System.out.println("Occupancy Group: " + bus.getOccupancyGroup());
		System.out.println("Occupancy Subgroup: " + bus.getSubgroup());
		System.out.println("Rentable Units: " + bus.getNumRentableUnits());
		System.out.println(bus.toString()); //toString
		
		System.out.println("==============================");
		
		//Residential Class
		Residential res = new Residential("Clayton Homes", "123 Home Sweet Home, Crestwood, Kentucky 40201", 1500, "Residential", "Group R-2", 3, 2, true);
		System.out.println("Residential Class: \nProject name: " + res.getProjectName()); //setters and getters
		System.out.println("Complete address: " + res.getCompleteAddress());
		System.out.println("Square Feet: " + res.getTotalSquareFeet());
		System.out.println("Occupancy Group: " + res.getOccupancyGroup());
		System.out.println("Occupancy Subgroup: " + res.getSubgroup());
		System.out.println("Number of bedrooms: " + res.getNumBedrooms());
		System.out.println("Number of bathrooms: " + res.getNumBathrooms());
		System.out.println("Laundry (T/F): " + res.isLaundryRoom());
		System.out.println(res.toString()); //toString
		
		System.out.println("==============================");
		
		//Mall Class
		Mall mall = new Mall("Oxmoor Center", "7900 Shelbyville Road, Louisville, Kentucky 40222", 150000, "Business", "Group B", 10, 4, 240, 1000);
		System.out.println("Mall Class: \nProject name: " + mall.getProjectName()); //setters and getters
		System.out.println("Complete address: " + mall.getCompleteAddress());
		System.out.println("Square Feet: " + mall.getTotalSquareFeet());
		System.out.println("Occupancy Group: " + mall.getOccupancyGroup());
		System.out.println("Occupancy Subgroup: " + mall.getSubgroup());
		System.out.println("Rentable Units: " + mall.getNumRentableUnits());
		System.out.println("Rented Units: " + mall.getNumRentedUnits());
		System.out.println("Median Unit Size: " + mall.getMedianUnitSize());
		System.out.println("Number of Parking Spaces: " + mall.getNumParkingSpaces());
		System.out.println(mall.toString()); //toString
		
		System.out.println("==============================");
		
		//Apartment Class
		Apartment apart = new Apartment("Crestwood Commons", "123 Judge Carden Blvd. Crestwood, Kentucky 40014", 84000, "Residential", "Group R-3", 2, 1, true, 82, 1100, true);
		System.out.println("Apartment Class: \nProject name: " + apart.getProjectName()); //setters and getters
		System.out.println("Complete address: " + apart.getCompleteAddress());
		System.out.println("Square Feet: " + apart.getTotalSquareFeet());
		System.out.println("Occupancy Group: " + apart.getOccupancyGroup());
		System.out.println("Occupancy Subgroup: " + apart.getSubgroup());
		System.out.println("Number of bedrooms: " + apart.getNumBedrooms());
		System.out.println("Number of bathrooms: " + apart.getNumBathrooms());
		System.out.println("Laundry (T/F): " + apart.isLaundryRoom());
		System.out.println("Number of Rentable Units: " + apart.getNumRentableUnits());
		System.out.println("Average Unit Size: " + apart.getAvgUnitSize());
		System.out.println("Parking Avaliable (T/F: " + apart.isParkingAvaliable());
		System.out.println(res.toString()); //toString
		
		System.out.println("==============================");
		
		//SingleFamilyHome Class
		SingleFamilyHome house = new SingleFamilyHome("Blue Roof House", "145 Tanglewood Rd. Versailles, Indiana 47042", 2400, "Residential", "Group R-4", 4, 3, true, true);
		System.out.println("Residential Class: \nProject name: " + house.getProjectName()); //setters and getters
		System.out.println("Complete address: " + house.getCompleteAddress());
		System.out.println("Square Feet: " + house.getTotalSquareFeet());
		System.out.println("Occupancy Group: " + house.getOccupancyGroup());
		System.out.println("Occupancy Subgroup: " + house.getSubgroup());
		System.out.println("Number of bedrooms: " + house.getNumBedrooms());
		System.out.println("Number of bathrooms: " + house.getNumBathrooms());
		System.out.println("Laundry (T/F): " + house.isLaundryRoom());
		System.out.println("Garage (T/F): " + house.isGarage());
		System.out.println(house.toString()); //toString
		
		
	} //end main

} //end class
