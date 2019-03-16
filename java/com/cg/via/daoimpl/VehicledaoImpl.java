package com.cg.via.daoimpl;

import java.util.HashMap;
import java.util.Map;

import com.cg.via.beans.VehicleDetails;
import com.cg.via.dao.Vehicledao;

public class VehicledaoImpl implements Vehicledao{
	Map<String,VehicleDetails> insuranceEntry;
	public VehicledaoImpl() {
		insuranceEntry=new HashMap<String, VehicleDetails>();
		insuranceEntry.put("AP28DR3029",new VehicleDetails("2Wheeler",2,1234698,"8501038408"));
		insuranceEntry.put("TS15PB5012",new VehicleDetails("2Wheeler",2,1259642,"1234569876"));
		
		
	}
	
	

	public String vehicleInsuranceRegistration(VehicleDetails details) {
		// TODO Auto-generated method stub
		
		
		
		return null;
	}

	public void insuranceValidityCheck() {
		// TODO Auto-generated method stub
		
	}

}
