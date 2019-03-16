package com.cg.via.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.via.beans.VehicleDetails;
import com.cg.via.serviceimpl.VehicleserviceImpl;

public class Menu {
	static VehicleserviceImpl service=new VehicleserviceImpl();
	static VehicleDetails details=new VehicleDetails();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" 1.VehicleInsuranceRegistration \n 2.Insurance Validation\n 3.Exit");
		System.out.println("enter the choice");
		int ch=sc.nextInt();
		switch(ch) {
		    
		case 1:
			 //vehicleInsuranceRegistration
			Map<String,VehicleDetails> insuranceEntry;
			insuranceEntry=new HashMap<String, VehicleDetails>();
			System.out.println("enter vehicle number");
			details.setVehicleno(sc.next());
			System.out.println("enter vehicle type");
			details.setVehicletype(sc.next());
			System.out.println("enter insurance period in terms of years");
			details.setInsuranceperiod(sc.nextInt());
			System.out.println("enter aadhar number");
			details.setAadharno(sc.nextLong());
			System.out.println("enter mobile number");
			details.setMobileno(sc.next());
			String vehiclekey=service.vehicleInsuranceRegistration(details);
			System.out.println("vehicle insurance registered "+details.getVehicleno());
		 
				
			
			
			
			break;
		case 2: 
			//InsuranceValidityCheck
			System.out.println("enter vehicle number");
			String vehicleno=sc.next();
			if(vehicleno==details.getVehicleno()) {
			
			System.out.println("insurance validity period"+details.getInsuranceperiod());
			
			}
			else {
				System.out.println("please register for vehicle Insurance");
			}
			break;
		case 3:
			//exit
			System.out.println("exited");
			System.exit(0);
			break;
		default:
			System.out.println("wrong choice");
			break;
		}
		
	}
		


}
}
