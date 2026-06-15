package JAVA_DAY_10;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ATM_CHECK {

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
                throw new Exception("Insufficient Balance");
            }
            
            if (withdraw < 0) {
                throw new Exception("Withdrawal amount cannot be negative");
            }

            balance -= withdraw;

            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance: " + balance);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
	}

}
