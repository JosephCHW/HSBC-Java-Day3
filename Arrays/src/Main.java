
public class Main {

	public static void main(String[] args) {
		int [] numbers = {21,46,79,34,92,50};
		String[] names = {"Joseph", "John", "Simon", "Tom", "Pete", "Aiden"};
		numbers[0] = 65;
		System.out.println(numbers[0]);
		try {
			System.out.println(numbers[6]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Oops array index out of bounds");
		}
		for (int i = 0; i < numbers.length; i++) System.out.print(numbers[i]+" ");
		//find max value
		int big = numbers[0];
		for (int i = 0; i < numbers.length; i++) if (numbers[i] > big) big = numbers[i];
		System.out.println("\nThe biggest number in the array is " + big);
	}

}
