package CURD_EmployeePayrollServices;

public class DBException extends Exception {

	public enum ExceptionType{
		CONNECTION_FAIL
	}
	ExceptionType type;

	public DBException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}
}