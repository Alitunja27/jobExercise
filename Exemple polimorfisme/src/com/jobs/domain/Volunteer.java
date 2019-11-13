package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		if (description==null) throw new Exception();

	}

	
	@Override
	public void pay() {
		totalPaid=0;
	}

}
