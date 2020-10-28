
public class Accounts {
	public void SalarySlip(String name, int salary, int absences) throws AbsencesException {
		float tax, netsalary;
		if (absences > 10) {
			AbsencesException ref = new AbsencesException();
			throw ref;
		// throw means to generate an exception (throw the reference) and start looking for exception handler
		}
		else {
			tax = (float) salary * 25/100; // * 0.25 instead of 25/100 doesn't work
			netsalary = salary - tax;
			System.out.println("Employee name: " + name);
			System.out.println("Your salary is £" + salary);
			System.out.println("Your tax is £" + tax);
			System.out.println("Your net salary is £" + netsalary);
		}
		// no try or catch here, use them outside class so exception handler can be changed
	}
}

// user defined exception NOT user defined exception handler