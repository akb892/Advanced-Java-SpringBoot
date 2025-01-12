package comm.exe;

import java.time.LocalDate;

public class Employee {
	private int empId;
	private String name;
	private Double salary;
	private LocalDate doj;
	
	public Employee() {
		this(0000, "Default Name", 10.00 , LocalDate.parse("2024-11-14"));
	}
	public Employee(int empId, String name, Double salary, LocalDate doj) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", doj=" + doj + "]";
	}
	
	
	
	

}
