package com.cg.via.serviceimpl;

import com.cg.via.beans.VehicleDetails;
import com.cg.via.daoimpl.VehicledaoImpl;
import com.cg.via.service.vehicleservice;

public class VehicleserviceImpl implements vehicleservice{
VehicledaoImpl vehicledao=new VehicledaoImpl();
	public String vehicleInsuranceRegistration(VehicleDetails details) {
		// TODO Auto-generated method stub
		String vehiclekey=vehicledao.vehicleInsuranceRegistration(details);
		return vehiclekey;
	}

	public void insuranceValidityCheck() {
		// TODO Auto-generated method stub
		
	}

}
