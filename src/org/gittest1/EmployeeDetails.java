package org.gittest1;

public class EmployeeDetails {
	
	private void empName() {
		System.out.println("Anand");
	}
	
	private void empMobile() {
		System.out.println("8939278836");
	}
	private void empAdd() {
		System.out.println("employee add: OMR-chennai");
	}
	private void empRefId() {
		System.out.println("employee ref id : 1111");
	}
//<<<<<<< HEAD
	
//=======
	
//>>>>>>> d38bc25390a65e2faf7fb6aa6056fbc2da891e08
	
	public static void main(String[] args) {
		
		EmployeeDetails e = new EmployeeDetails();
		e.empMobile();
		e.empName();
	}

}
