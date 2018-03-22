
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cars = new LinkedList<String>();
		// List<String> cars = new LinkedList<String>();

		// Adding
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");

		// Size
		int size = cars.size();

		// Get
		System.out.println("The item on index 1 is: " + cars.get(1));

		// Iteration
		System.out.println("\nIteration Example");
		for(int i = 0; i < size; i++) {
			System.out.println("Item on index " + i + " is: " + cars.get(i));
		}

		// Using for each loop
		System.out.println("\nIteration Example");
		for(String car : cars) {
			System.out.println("The item is: " + car);
		}

		// Remove
		cars.remove(2);

		System.out.println("\nFor Loop after Removing");
		System.out.println("Iteration Example");

		System.out.println("\nIteration Example");
		for(String car : cars) {
			System.out.println("The item is: " + car);
		}

	}
}
