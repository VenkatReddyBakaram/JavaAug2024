class Employee
{
	int empId;
	String empName;
	double empSal;
	
	void empDetails(){
		empId=1234;
		empName="Venkat Reddy";
		empSal=500000.00;

		System.out.println("Employee ID :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Salary :"+empSal);		
	}

	public static void main(String args[])
	{
		Employee emp = new Employee();
		emp.empDetails();
	}
}