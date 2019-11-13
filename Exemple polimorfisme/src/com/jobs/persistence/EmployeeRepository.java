package com.jobs.persistence;

import com.jobs.domain.AbsStaffMember;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {


	public static List<AbsStaffMember> members = new ArrayList<>();

	public EmployeeRepository(){
		
	}
	
	public static List<AbsStaffMember> getAllMembers(){
		return new ArrayList<>(members);
	}
	
	
	public static void addMember(AbsStaffMember member) throws Exception{
		if(member==null) throw new Exception();
		members.add(member);
	}

	@Override
	public String toString() {
		return "EmployeeRepository{}";
	}

}
