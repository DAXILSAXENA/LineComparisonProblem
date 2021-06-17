import java.util.*;

public class LineComparisonComputation {
	public static void main(String args[]) {
		System.out.println("Welcome to Line Comparison Computation Program:");

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of x1: ");
		float x1 = scan.nextFloat();
		System.out.print("Enter the value of y1: ");
		float y1 = scan.nextFloat();
		System.out.print("Enter the value of x2: ");
		float x2 = scan.nextFloat();
		System.out.print("Enter the value of y2: ");
		float y2 = scan.nextFloat();
		scan.close();

		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("The 2 points of the line are: (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")");
		System.out.println("Length of the line is: " + distance + " units.");
	}
}
