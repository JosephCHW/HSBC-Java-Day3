
public class Main {

	public static void main(String[] args) {
		String num1, num2;
		float result;
		num1 = "50";
		num2 = "10";
		
		try {
			result = Integer.parseInt(num1)/Integer.parseInt(num2);
			// result = Float.parseFloat(num1)/Float.parseFloat(num2);
			System.out.println("Division is " + result);
		}
		catch (NumberFormatException e) { // if for example it is a string not an integer
			System.out.println("Can only use digits in operations");
		}
		catch(ArithmeticException e) { // if dividing by zero (for ints...doesn't raise the error for floats)
			System.out.println("Can't divide by zero");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		} // order of catch blocks important!
		// put generic exception block at the end, generic message not as informative
		// if this exception were to come before other exceptions, those subsequent exceptions would be useless
	}

}