package com;

import java.util.ArrayList;

public class Travel {
	
	public static boolean isCarDriver(Driver driver) {
		if(driver.getCategory().equals("CAR")) {
			return true;
		}
		
		return false;
		
	}
	public static String retrivebyDriverId(ArrayList<Driver> drivers , int driverID) {
		for(Driver driver: drivers) {
			if(driver.getDriverId()==driverID)	{
				return "Driver name is "+driver.getDriverName()+" Belonging to the category "+driver.getCategory()+" travelled "+driver.getTotalDistance()+" KM so far";
				}
			}
		return null;
	}
	
	public static int retriveCountOfDriver(ArrayList<Driver> drivers,String category) {
		int count=0;
		for(Driver driver: drivers) {
			if(driver.getCategory().equals(category)) {
				count++;
			}
		}
		return count;
	}
	
	public static ArrayList<Driver> retriveDriver(ArrayList<Driver> drivers,String category){
		
		ArrayList<Driver> arrayList = new ArrayList<>();
		for(Driver driver: drivers) {
			if(driver.getCategory().equals(category)) {
				arrayList.add(driver);
			}
		}
		return arrayList;
	}

	public static Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
		double maxDistance=0;
		Driver maxDriver=null;
		for(Driver driver: drivers) {
			if(driver.getTotalDistance()>maxDistance) {
				maxDistance=driver.getTotalDistance();
				maxDriver=driver;
			}
		}
		return maxDriver;
 	}
}

