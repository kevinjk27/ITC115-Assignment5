/*
 * Kevin Kantono 02/09/2020
 * This method takes a string, followed with an integer (as the number of grade to be processed) and the grades.
 * This will return average of grade with in a statement "Kevin's grade is: 87"
 * 
 */
import java.util.*;

public class printGPA {

	public static void main(String[] args) {
		GPACalculator();
	}

	public static void GPACalculator() {
		//initialize the scanner by using Scanner with system.in function
		System.out.print("Enter a student record: ");
		Scanner console = new Scanner(System.in);
		
		//the 1st parameter to be passed is a string --student's name--
		String name = console.next();
		//the 2nd parameter to be passed is an int --number of subject--
		int numOfSubject = console.nextInt();
		//initializing the sum of GPA
		double sumGPA = 0.0;

		//for loop by incrementing the grade based on the number of subject
		for (int i = 1; i <= numOfSubject; i++) {
			int grade = console.nextInt();
			sumGPA = sumGPA + grade;
		}
		
		//calculating the average GPA
		double avgGPA = sumGPA / numOfSubject;
		//formatting the GPA into 2 decimal places
		String GPA = String.format("%.02f", avgGPA);

		//printing the outcome
		System.out.print(name + "'s grade is: " + GPA);
	}
}
