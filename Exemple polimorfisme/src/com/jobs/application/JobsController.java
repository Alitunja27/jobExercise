package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

import java.util.List;

public class JobsController {

	//private EmployeeRepository repository;
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		EmployeeRepository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		EmployeeRepository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee managerEmployee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentManagerEmployee());
		EmployeeRepository.addMember(managerEmployee);
	}

	public void payAllEmployees() {
		List<AbsStaffMember> staff = EmployeeRepository.getAllMembers();
		for (AbsStaffMember member : staff) {
			member.pay();
		}
	}

	public List<AbsStaffMember> getAllEmployees() {
		return EmployeeRepository.getAllMembers();
	}

	public void createVolunteer(String name, String address, String phone, String description) throws Exception {
		Volunteer volunteer = new Volunteer (name,address,phone,description);
		EmployeeRepository.addMember(volunteer);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
