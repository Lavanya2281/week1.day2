package week1.day2.assignments;

public class EmployeeDetails {

	public static void main(String[] args) {
	  
		EmployeeDetails obj = new EmployeeDetails ();
		obj.printEmployeeName ("Lavanya", 456778);
		obj.getEmployeeAddress("No, Street Name, Area, Chennai - PINCODE");
		obj.printEmployeeSalary(80000.00);
		obj.printEmployeeMobileNumber(9879668968L);
    }

    public void printEmployeeName(String empName, int empId) {
	    System.out.println("Employee Name is " + empName + " & " + "Employee ID is " + empId);
    }

    public void getEmployeeAddress(String empAddress) {
	   System.out.println("Employee Address is " + empAddress);
    }	
	
    public void printEmployeeSalary(double empSalary) {
    	System.out.println("Employee Salary is " + empSalary);
    }

    public void printEmployeeMobileNumber(long mobNum) {
    System.out.println("Employee Mobile Number is " + mobNum);
    }
}