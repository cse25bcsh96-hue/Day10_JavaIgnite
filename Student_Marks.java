package JAVA_DAY_10;
import java.util.InputMismatchException;
import java.util.Scanner;

public class STUDENT_MARKS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        int[] marks = {89, 70, 99, 69, 85};

	        try {
	            System.out.println("Enter index (0-4): ");
	            int index = sc.nextInt();

	            System.out.println("Student mark: " + marks[index]);
	        }
	        catch (InputMismatchException e) {
	            System.out.println("Invalid input! Please enter a number.");
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Invalid index! Enter a value between 0 and 4.");
	        }

	        sc.close();
	}

}
