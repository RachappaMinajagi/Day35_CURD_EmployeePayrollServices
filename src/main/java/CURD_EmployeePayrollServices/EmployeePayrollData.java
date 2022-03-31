package CURD_EmployeePayrollServices;

import java.time.LocalDate;

/**
 * Create a class employeeId
 * 
 * @author Rachoti
 *
 */

public class EmployeePayrollData {
	/**
	 * Declaring variable employeeId,employeeName,salary,startDate
	 */
	private int employeeId;
	private String employeeName;
	private double salary;
	private LocalDate startDate;

	/**
	 * Create a constructor EmployeePayrollData
	 */
	public EmployeePayrollData() {
	}

	/**
	 * Parameters passing
	 * 
	 * @param employeeId
	 * @param employeeName
	 * @param salary
	 */
	public EmployeePayrollData(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public EmployeePayrollData(int employeeId, String employeeName, double salary, LocalDate startDate) {
		this(employeeId, employeeName, salary);
		this.startDate = startDate;
	}

	/**
	 * Create a getter and Setter method
	 * 
	 * @return
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * Create @Override method
	 */
	@Override
	public String toString() {
		return "Id : " + employeeId + "\t" + "Name : " + employeeName + "\t" + "Salary : " + salary + "\t"
				+ "Start Date : " + startDate;
	}
}