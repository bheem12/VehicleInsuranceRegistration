package com.cg.via.beans;

public class VehicleDetails {
	
	
	private String vehicleno;
	private String vehicletype;
	private int insuranceperiod;
	private long aadharno;
	private String mobileno;
	public String getVehicleno() {
		return vehicleno;
	}
	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}
	public String getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}
	public int getInsuranceperiod() {
		return insuranceperiod;
	}
	public void setInsuranceperiod(int insuranceperiod) {
		this.insuranceperiod = insuranceperiod;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	public VehicleDetails() {
		// TODO Auto-generated constructor stub
	}
	public VehicleDetails(String string, int i, long j, String string2) {
		// TODO Auto-generated constructor stub
		
		string=vehicletype;
		i=insuranceperiod;
		j=aadharno;
		string2=mobileno;
		
	}
	

}
