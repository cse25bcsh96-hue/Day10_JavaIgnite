package JAVA_DAY_10;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BANKING_SYSTEM {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter withdrawal amount: ");
            double withdraw = sc.nextDouble();

            if (withdraw > balance) {
                throw new Exception("Insufficient balance");
            }

            balance -= withdraw;

            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
	}

}
