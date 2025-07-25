package test7.sub3;

public class Employee extends Person{
	protected String employeeId;
	protected String dept;
	protected int salary;
		
	public Employee(String name, String birth, String employeeId, String dept, int salary) {
		super(name, birth);
		this.employeeId = employeeId;
		this.dept = dept;
		this.salary = salary;
	}

	public void raiseSalary(int salary) {
		this.salary += salary;
	}
	
	public void changeDept(String dept) {
		this.dept = dept;
	}

	public void printEmployeeInfo() {
		super.printPersonInfo();
		System.out.println("직원 아이디 : " + this.employeeId);
		System.out.println("부서 : " + this.dept);
		System.out.println("급여 : " + this.salary);
	}
	
}
