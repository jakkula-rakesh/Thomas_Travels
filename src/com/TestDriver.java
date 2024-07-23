package com;

import java.util.ArrayList;

public class TestDriver {
	
	public static void main(String[] args) {
		Driver driver1=new Driver(1,123.38,"RE","Rakesh");
		Driver driver2=new Driver(2,1233.38,"CAR","Rakesh");
		Driver driver3=new Driver(3,1235.38,"AUTO","Rakesh");
		Driver driver4=new Driver(4,12333.38,"REKSHAW","Rakesh");
		Driver driver5=new Driver(5,1323.38,"BUS","Rakesh");
		Driver driver6=new Driver(6,1523.38,"CYCLE","Rakesh");
		Driver driver7=new Driver(7,1263.38,"VAN","Rakesh");
		
		ArrayList<Driver> arrayList = new ArrayList<>();
		arrayList.add(driver1);
		arrayList.add(driver2);
		arrayList.add(driver3);
		arrayList.add(driver4);
		arrayList.add(driver5);
		arrayList.add(driver6);
		arrayList.add(driver7);
		
		System.out.println(Travel.isCarDriver(driver2));
		System.out.println(Travel.retrivebyDriverId(arrayList, 3));
		System.out.println(Travel.retriveCountOfDriver(arrayList, "CAR"));
		System.out.println(Travel.retriveDriver(arrayList, "CAR"));
		System.out.println(Travel.retriveMaximumDistanceTravelledDriver(arrayList));
	}

}
