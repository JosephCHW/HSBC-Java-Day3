
public class Main {

	public static void main(String[] args) {
		Accounts salesdepartment = new Accounts();
		Accounts ITdepartment = new Accounts();
		try {
			salesdepartment.SalarySlip("Shafeeq",1000,11);	
		}
		catch(AbsencesException E) {
			System.out.println("Send me the report!");
		}
		try {
			ITdepartment.SalarySlip("Ali", 5000, 8);	
		}
		catch(AbsencesException E) {
			System.out.println("It's fine bro");
		}
		// now the sales and IT departments are handling the exception their own way
		// this wouldn't be possible if the exception handling was simply hard coded in the Accounts class
		
		
	}

}
