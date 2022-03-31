package CURD_EmployeePayrollServices;

import static java.util.Arrays.asList;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import CURD_EmployeePayrollServices.EmployeePayrollData;
import CURD_EmployeePayrollServices.EmployeePayrollService;
import CURD_EmployeePayrollServices.EmployeePayrollService.IOService;

/**
 * Create class EmployeePayrollServiceTest Added Salary is Updated Database
 */

public class EmployeePayrollServiceTest {
	private static final IOService DB_IO = null;

	@Test
	public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmps = { new EmployeePayrollData(1, "Jeff Bezos", 100000.0),
				new EmployeePayrollData(2, "Bill Gates", 200000.0),
				new EmployeePayrollData(3, "Mark Zuckerberg", 300000.0) };
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(asList(arrayOfEmps));
		employeePayrollService.printEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
	    employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
		long entries = employeePayrollService.countEnteries(EmployeePayrollService.IOService.FILE_IO);
		Assert.assertEquals(3, entries);
	}

	/**
	 * Create method givenFileOnReadingFromFileShouldMatchEmployeeCount create
	 * object of EmployeePayrollService Create Array List of EmployeePayrollData
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void givenFileOnReadingFromFileShouldMatchEmployeeCount() {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		List<EmployeePayrollData> entries = employeePayrollService
				.printEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
		Assert.assertEquals(3, entries);
	}

	@Test
	public void givenEmployeePayrollInDB_WhenRetrived_ShouldMathchEmployeeCount() {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		List<EmployeePayrollData> employeePayrollData = employeePayrollService.printEmployeePayrollData(DB_IO);
		Assert.assertEquals(3, employeePayrollData.size());
	}
}